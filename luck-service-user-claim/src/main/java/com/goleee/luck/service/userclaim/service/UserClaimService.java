package com.goleee.luck.service.userclaim.service;

import org.goleee.luck.service.account.domain.Account;
import org.goleee.luck.service.account.domain.User;

public interface UserClaimService
{
	
	
	UserClaim saveChange(int id, UserClaim update);
	
	/**
	 * 通过给定的名字查找账户
	 *
	 * @param accountName
	 * @return found account
	 */
	Account findByName(String accountName);

	/**
	 * Checks if account with the same name already exists Invokes Auth Service
	 * user creation Creates new account with default parameters
	 *
	 * @param user
	 * @return created account
	 */
	Account create(User user);

	/**
	 * Validates and applies incoming account updates Invokes Statistics Service
	 * update
	 *
	 * @param name
	 * @param update
	 */
	void saveChanges(String name, Account update);
}
