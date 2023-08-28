//package com.phq.controller;
//
//import com.phq.domain.ResponseResult;
//import com.phq.domain.dto.UserDto;
//import com.phq.domain.dto.UserUpdateDto;
//import com.phq.domain.vo.PageVo;
//import com.phq.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/system/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/list")
//    public ResponseResult<PageVo> userList(Integer pageNum, Integer pageSize, String userName, String phonenumber, String status){
//        return userService.userList(pageNum,pageSize,userName,phonenumber,status);
//    }
//    @PostMapping
//    public ResponseResult insertUser(@RequestBody UserDto userDto){
//        return userService.insertUser(userDto);
//    }
//    @DeleteMapping("/{id}")
//    public ResponseResult deleteUser(@PathVariable("id") Long id){
//        return userService.deleteUser(id);
//    }
//
//    @GetMapping("{id}")
//    public ResponseResult userListById(@PathVariable("id") Long id){
//        return userService.userListById(id);
//    }
//    @PutMapping
//    public ResponseResult updateUser(@RequestBody UserUpdateDto userUpdateDto){
//        return userService.updateUser(userUpdateDto);
//    }
//
//}
