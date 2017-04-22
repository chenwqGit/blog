/********************************************
 * 系统名称: 个人博客第1版(BLOG)
 * 模块名称: 用户管理
 * 软件版权: 
 * 源程序名：UserController.java
 * 功能说明: 
 * 开发人员: chenwq
 * 开发时间: 2017-4-22 上午12:27:21
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 * v4.0.0.0 2017-4-22-01 chenwq TODO  
 *******************************************/

package com.blog.common.t01.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.common.t01.pojo.User;
import com.blog.common.t01.service.IUserService;

/**
 * 功能说明：用户管理 控制器
 *
 * @date 2017-4-22
 * @author chenwq
 * @email chenwqEmail@163.com
 * 
 */
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  
