/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.poc.employee.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the EmployeeEntry service. Represents a row in the &quot;DG_EmployeeEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.poc.employee.model.impl.EmployeeEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.poc.employee.model.impl.EmployeeEntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntry
 * @generated
 */
@ProviderType
public interface EmployeeEntryModel
	extends BaseModel<EmployeeEntry>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee entry model instance should use the {@link EmployeeEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this employee entry.
	 *
	 * @return the primary key of this employee entry
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this employee entry.
	 *
	 * @param primaryKey the primary key of this employee entry
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this employee entry.
	 *
	 * @return the uuid of this employee entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this employee entry.
	 *
	 * @param uuid the uuid of this employee entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the employee ID of this employee entry.
	 *
	 * @return the employee ID of this employee entry
	 */
	@AutoEscape
	public String getEmployeeId();

	/**
	 * Sets the employee ID of this employee entry.
	 *
	 * @param employeeId the employee ID of this employee entry
	 */
	public void setEmployeeId(String employeeId);

	/**
	 * Returns the group ID of this employee entry.
	 *
	 * @return the group ID of this employee entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this employee entry.
	 *
	 * @param groupId the group ID of this employee entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this employee entry.
	 *
	 * @return the company ID of this employee entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this employee entry.
	 *
	 * @param companyId the company ID of this employee entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this employee entry.
	 *
	 * @return the user ID of this employee entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this employee entry.
	 *
	 * @param userId the user ID of this employee entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee entry.
	 *
	 * @return the user uuid of this employee entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this employee entry.
	 *
	 * @param userUuid the user uuid of this employee entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this employee entry.
	 *
	 * @return the user name of this employee entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this employee entry.
	 *
	 * @param userName the user name of this employee entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this employee entry.
	 *
	 * @return the create date of this employee entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this employee entry.
	 *
	 * @param createDate the create date of this employee entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this employee entry.
	 *
	 * @return the modified date of this employee entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employee entry.
	 *
	 * @param modifiedDate the modified date of this employee entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this employee entry.
	 *
	 * @return the name of this employee entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employee entry.
	 *
	 * @param name the name of this employee entry
	 */
	public void setName(String name);

	/**
	 * Returns the birth day of this employee entry.
	 *
	 * @return the birth day of this employee entry
	 */
	public Date getBirthDay();

	/**
	 * Sets the birth day of this employee entry.
	 *
	 * @param birthDay the birth day of this employee entry
	 */
	public void setBirthDay(Date birthDay);

	/**
	 * Returns the gender of this employee entry.
	 *
	 * @return the gender of this employee entry
	 */
	public int getGender();

	/**
	 * Sets the gender of this employee entry.
	 *
	 * @param gender the gender of this employee entry
	 */
	public void setGender(int gender);

	/**
	 * Returns the address of this employee entry.
	 *
	 * @return the address of this employee entry
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this employee entry.
	 *
	 * @param address the address of this employee entry
	 */
	public void setAddress(String address);

	/**
	 * Returns the has account of this employee entry.
	 *
	 * @return the has account of this employee entry
	 */
	public boolean getHasAccount();

	/**
	 * Returns <code>true</code> if this employee entry is has account.
	 *
	 * @return <code>true</code> if this employee entry is has account; <code>false</code> otherwise
	 */
	public boolean isHasAccount();

	/**
	 * Sets whether this employee entry is has account.
	 *
	 * @param hasAccount the has account of this employee entry
	 */
	public void setHasAccount(boolean hasAccount);

}