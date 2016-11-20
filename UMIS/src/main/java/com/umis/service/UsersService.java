package com.umis.service;

import java.util.List;

import com.umis.entity.Users;
import com.umis.exception.UsersException;


public interface UsersService {

    /**
     * @apiDefine User
     *
     * @apiParam (user) {string} username 用户名
     * @apiParam (user) {string} password 密码
     * @apiParam (user) {string} email 邮箱
     * @apiParam (user) {json} staff 详细资料
     */
    /**
     * @apiDefine Staff
     *
     * @apiParam (staff) {string} name 姓名
     * @apiParam (staff) {string} sex 性别(M or F)
     * @apiParam (staff) {string} [address] 地址
     * @apiParam (staff) {string} phone 联系电话
     * @apiParam (staff) {string} idcode 身份证
     * @apiParam (staff) {int} level 级别
     * @apiParam (staff) {string} joindate 入职日期(yyyy-mm-dd)
     */

    /**
     * @api {post} /api/user 新增用户
     * @apiGroup 2.User
     * @apiName addUser
     * @apiVersion 0.1.0
     * @apiDescription 新增一个用户
     * @apiPermission level3
     *
     * @apiParam {json} user user details
     * @apiUse User
     * @apiUse Staff
     *
     * @apiParamExample {json} Request Example
     *  POST /api/user
     *  {
     *      "username": "ccl",
     *      "password": "b5be656a7060dd3525027d6763c33ca0",
     *      "email": "ymbn02@163.com",
     *      staff: {
     *          "name": "abb",
     *          "sex": "M",
     *          "address": "test",
     *          "phone": "13000000000",
     *          "idcode": "000000000000000000",
     *          "level": 4,
     *          "joindate": "2016-04-05"
     *      }
     *  }
     *
     *  @apiSuccess {number} code=0 结果码
     *  @apiSuccess {string} msg="success" 返回结果
     *  @apiSuccessExample {json} Success Example
     *   HTTP/1.1 200 OK
     *   {
     *       "code": 0,
     *       "msg": "success"
     *   }
     *
     *  @apiError {number} code 结果码
     *  @apiError {string} msg 返回结果
     *  @apiErrorExample {json} Error Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 10000,
     *      "msg": "Permission denied"
     *  }
     */
    public void addUser(Users user) throws UsersException;


    /**
     * @api {get} api/user/{param} 获取用户信息
     * @apiGroup 2.User
     * @apiName getUser
     * @apiVersion 0.1.0
     * @apiDescription 通过用户id或者username获取用户信息
     * @apiPermission level1
     *
     * @apiParam {number} [id] any id
     * @apiParam {string} [username] any username
     *
     * @apiSuccess {number} code=0 结果码
     * @apiSuccess {json} user 返回结果
     * @apiSuccessExample {json} Success Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 0,
     *      "user": {
     *          "id": "",
     *          "username": "",
     *          "email": "",
     *          ...
     *      }
     *  }
     *
     *  @apiError {number} code 结果码
     *  @apiError {string} msg 返回结果
     *  @apiErrorExample {json} Error Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 10000,
     *      "msg": "Permission denied"
     *  }
     */
    public Users getUser(int id) throws UsersException;
    public Users getUser(String username) throws UsersException;

    /**
     * @api {get} api/user/all 获取所有用户信息
     * @apiGroup 2.User
     * @apiName getAllUsers
     * @apiVersion 0.1.0
     * @apiDescription 获取所有用户信息
     * @apiPermission level1
     *
     * @apiSuccess {number} code=0 结果码
     * @apiSuccess {json} users 返回结果
     * @apiSuccessExample {json} Success Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 0,
     *      "user": {
     *          "id": "",
     *          "username": "",
     *          "email": "",
     *          ...
     *      },
     *      ...
     *  }
     *
     *  @apiError {number} code 结果码
     *  @apiError {string} msg 返回结果
     *  @apiErrorExample {json} Error Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 10000,
     *      "msg": "Permission denied"
     *  }
     */
    public List<Users> getAllUsers();

    /**
     * @api {put} /api/user 修改用户信息
     * @apiGroup 2.User
     * @apiName updateUser
     * @apiVersion 0.1.0
     * @apiDescription 修改用户信息
     * @apiPermission level4
     *
     * @apiParam {json} user user details
     * @apiUse User
     * @apiUse Staff
     *
     * @apiParamExample {json} Request Example
     *  PUT /api/user
     *  {
     *      "username": "lostmoonkin",
     *      "password": "b5be656a7060dd3525027d6763c33ca0",
     *      "email": "ymbn02@163.com",
     *      staff: {
     *          "name": "abb",
     *          "sex": "M",
     *          "address": "test",
     *          "phone": "13000000000",
     *          "idcode": "000000000000000000",
     *          "level": 4,
     *          "joindate": "2016-04-05"
     *      }
     *  }
     *
     *  @apiSuccess {number} code=0 结果码
     *  @apiSuccess {json} user 返回结果
     *  @apiSuccessExample {json} Success Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 0,
     *      "user": {
     *          "id": "",
     *          "username": "",
     *          "email": "",
     *          ...
     *      }
     *  }
     *
     *  @apiError {number} code 结果码
     *  @apiError {string} msg 返回结果
     *  @apiErrorExample {json} Error Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 10000,
     *      "msg": "Permission denied"
     *  }
     */
    public Users updateUser(Users user) throws UsersException;

    /**
     * @api {get} /login?username={username}&password={password} 获取Access_Token
     * @apiGroup 1.Login
     * @apiName doLogin
     * @apiVersion 0.1.1
     * @apiDescription 通过账号密码获得Access_Token
     * @apiPermission level0
     *
     * @apiParam {string} username 用户名
     * @apiParam {string} password 密码
     *
     * @apiSuccess {number} code=0 结果码
     * @apiSuccess {string} Access_Token Access_Token
     * @apiSuccess {number} level token权限
     * @apiSuccess {string} expires_in 有效时间(ms)
     * @apiSuccessExample {json} Success Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 0,
     *      "Access_Token": "",
     *      "level: "",
     *      "expires_in": ""
     *  }
     *
     *  @apiError {number} code 结果码
     *  @apiError {string} msg 返回结果
     *  @apiErrorExample {json} Error Example
     *  HTTP/1.1 200 OK
     *  {
     *      "code": 10004,
     *      "msg": "Wrong Password"
     *  }
     */
    //public String doLogin(String username, String password) throws UsersException;
}
