package com.umis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.umis.entity.Users;
import com.umis.exception.UsersException;
import com.umis.repository.UsersRepository;
import com.umis.util.ExceptionCode;


/*@Transactional 注解可以管理数据库事务 
 * 下面的意思是指定特定异常时数据回滚
 *@Transactional rollbackFor={IllegaArgumentException.class}
 *
 * 下面的意思是指定特定异常时数据回滚
 *@Transactional norollbackFor={IllegaArgumentException.class}
 * 
 */

@Component("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService  {

    @Autowired
    private UsersRepository usersRepository;

   
    public void addUser(Users user) throws UsersException {
        if (user == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        usersRepository.save(user);
    }

    
    public Users getUser(int id) throws UsersException {
        Users user = usersRepository.findOne(id);
        if (user == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        return user;
    }

    
    /*public Users getUser(String username) throws UsersException {
        Users user = usersRepository.findByUserName(username);
        if (user == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        return user;
    }*/
    
    public Users getUser(String userName) throws UsersException {
        Users user = usersRepository.findUserNameLike(userName);
        if (user == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        return user;
    }

    
    public List<Users> getAllUsers() {
        List<Users> userList = (List<Users>) usersRepository.findAll();
        return userList;
    }
    
    

    
    public Users updateUser(Users user) throws UsersException {
        Users tempUser = usersRepository.findByUserName(user.getUserName());
        if (tempUser == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        if (user.getPassWord() != null) {
            tempUser.setPassWord(user.getPassWord());
        }
        if (user.getUserNumber() != null) {
            tempUser.setUserNumber(user.getUserNumber());
        }

        
        usersRepository.save(tempUser);
        return tempUser;
    }
    
    public void  deleteUser(Users user){
    	usersRepository.delete(user);
    }
    
/*
    @Override
    public String doLogin(String username, String password) throws UsersException {
        Users user = usersRepository.findByUsername(username);
        if (user == null) {
            throw new UsersException(ExceptionCode.User_Not_Found, "User Not Found");
        }
        if (!user.getPassWord().equals(password)) {
            throw new UsersException(ExceptionCode.Wrong_Password, "Wrong Password");
        }

        TokenManager tokenManager = TokenManager.getInstance();
        return tokenManager.getToken(user);
    }
*/


	
	public String doLogin(String username, String password) throws UsersException {
		return null;
	}	
}