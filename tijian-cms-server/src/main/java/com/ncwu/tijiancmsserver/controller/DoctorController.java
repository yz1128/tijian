package com.ncwu.tijiancmsserver.controller;

import com.ncwu.tijiancmsserver.mapper.DoctorMapper;
import com.ncwu.tijiancmsserver.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin//允许跨域
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    private DoctorMapper doctorMapper;

    /**
     * 用户的登录请求
     * @param map 用于封装请求中的参数数据
     * @return 返回响应的json数据
     * 注意：
     *      1.由于前端登录时，使用的Post请求，并使用Josn对象直接作为请求体数据
     *      因此后端接受数据时需要使用@RequestBody注解
     *      2.由于数据表中的字段没有使用 _ 分隔多个单词 前后端参数名称不一样
     *          解决方法
     *          1.修改实体类             （对应所有MyBatis相关映射）
     *          2.定义VO类              （VO专门和前端页面交互）
     *          3.使用Map集合接受请求参数
     *          4.修改前端传递的参数名称   （这种方法通常不被允许使用）
     *
     */
    @RequestMapping("/getDoctorByCodeByPass")
    public Object getDoctorByCodeByPass(@RequestBody Map map ) {
        System.out.println(map);
        /*
          调用医生登录业务方式
          参数为医生编码和密码
          注意：
           可以传递Map集合
           可以传递实体类
           可以单个传递编号和密码
           返回值为医生对象，如果医生对象为null，表示登录失败
           否则登录成功
         */
        Doctor doctor = doctorService.getDoctorByCodeByPass(
                map.get("docCode").toString(),
                map.get("password").toString());
        if (doctor != null){
            return doctor;
        }
        return "";
    }
}
