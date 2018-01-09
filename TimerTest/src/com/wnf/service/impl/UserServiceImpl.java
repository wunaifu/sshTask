package com.wnf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wnf.entity.User;
import com.wnf.service.UserService;
import com.wnf.dao.UserDao;

/**
 * @author mry
 *2018年1月2日 上午8:44:07
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	@Override
	public User loginUser(String account) {

		return userDao.loginUser(account);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public User getUserByAccount(String account) {
		return userDao.getUserByAccount(account);
	}

	/* (non-Javadoc)
         * @see com.yongxin.service.UserService#getUserByName(java.lang.String)
         */
	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#addUser(com.yongxin.entity.User)
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#deleteUserById(int)
	 */
	@Override
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		if (userDao.deleteUserById(id) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUserPermission(int id, int permission) {
		if (userDao.updateUserPermission(id, permission)==1) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
         * @see com.yongxin.service.UserService#getUsers()
         */
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#getUsers(int)
	 */
	@Override
	public List<User> getUsers(int num) {
		// TODO Auto-generated method stub
		return userDao.getUsers(num);
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#getPageNum()
	 */
	@Override
	public int getPageNum() {
		// TODO Auto-generated method stub
		return userDao.getPageNum();
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#checkUserPsw(int, java.lang.String)
	 */
	@Override
	public boolean checkUserPsw(int id, String oldPassword) {
		// TODO Auto-generated method stub
		List<User> managers = userDao.checkUserPsw(id,oldPassword);
		if (managers != null&&managers.size()>0) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#updateUserPsw(int, java.lang.String)
	 */
	@Override
	public boolean updateUserPsw(int id, String newPassword) {
		// TODO Auto-generated method stub
		if (userDao.updateUserPsw(id,newPassword) == 1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean updateUserInfo(int id, String name) {
		// TODO Auto-generated method stub
		if (userDao.updateUserInfo(id,name) == 1) {
			return true;
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see com.yongxin.service.UserService#update(com.yongxin.entity.User)
	 */
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		if(userDao.update(user)==1){
			return true;
			}
		return false;
	}

	@Override
	public List<User> getUserListByPermission(int permission, int num) {
		return userDao.getUserListByPermission(permission,num);
	}

	@Override
	public int getPageNumByPermission(int grade) {
		return userDao.getPageNumByPermission(grade);
	}

	@Override
	public boolean isOrNotAgreeAdd(int id, int permission) {
		if (userDao.updateUserPermission(id, permission) == 1) {
			return true;
		}
		return false;
	}

}
