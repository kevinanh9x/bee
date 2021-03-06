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

package com.dogoo.poc.pet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PetEntry service. Represents a row in the &quot;DG_PetEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.dogoo.poc.pet.model.impl.PetEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.dogoo.poc.pet.model.impl.PetEntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PetEntry
 * @generated
 */
@ProviderType
public interface PetEntryModel
	extends BaseModel<PetEntry>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pet entry model instance should use the {@link PetEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this pet entry.
	 *
	 * @return the primary key of this pet entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pet entry.
	 *
	 * @param primaryKey the primary key of this pet entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this pet entry.
	 *
	 * @return the uuid of this pet entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this pet entry.
	 *
	 * @param uuid the uuid of this pet entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the pet ID of this pet entry.
	 *
	 * @return the pet ID of this pet entry
	 */
	public long getPetId();

	/**
	 * Sets the pet ID of this pet entry.
	 *
	 * @param petId the pet ID of this pet entry
	 */
	public void setPetId(long petId);

	/**
	 * Returns the group ID of this pet entry.
	 *
	 * @return the group ID of this pet entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pet entry.
	 *
	 * @param groupId the group ID of this pet entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pet entry.
	 *
	 * @return the company ID of this pet entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pet entry.
	 *
	 * @param companyId the company ID of this pet entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pet entry.
	 *
	 * @return the user ID of this pet entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pet entry.
	 *
	 * @param userId the user ID of this pet entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pet entry.
	 *
	 * @return the user uuid of this pet entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this pet entry.
	 *
	 * @param userUuid the user uuid of this pet entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pet entry.
	 *
	 * @return the user name of this pet entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pet entry.
	 *
	 * @param userName the user name of this pet entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pet entry.
	 *
	 * @return the create date of this pet entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pet entry.
	 *
	 * @param createDate the create date of this pet entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pet entry.
	 *
	 * @return the modified date of this pet entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pet entry.
	 *
	 * @param modifiedDate the modified date of this pet entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the creator ID of this pet entry.
	 *
	 * @return the creator ID of this pet entry
	 */
	public long getCreatorId();

	/**
	 * Sets the creator ID of this pet entry.
	 *
	 * @param creatorId the creator ID of this pet entry
	 */
	public void setCreatorId(long creatorId);

	/**
	 * Returns the scope org ID of this pet entry.
	 *
	 * @return the scope org ID of this pet entry
	 */
	public long getScopeOrgId();

	/**
	 * Sets the scope org ID of this pet entry.
	 *
	 * @param scopeOrgId the scope org ID of this pet entry
	 */
	public void setScopeOrgId(long scopeOrgId);

	/**
	 * Returns the name of this pet entry.
	 *
	 * @return the name of this pet entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this pet entry.
	 *
	 * @param name the name of this pet entry
	 */
	public void setName(String name);

	/**
	 * Returns the tag of this pet entry.
	 *
	 * @return the tag of this pet entry
	 */
	@AutoEscape
	public String getTag();

	/**
	 * Sets the tag of this pet entry.
	 *
	 * @param tag the tag of this pet entry
	 */
	public void setTag(String tag);

	/**
	 * Returns the status of this pet entry.
	 *
	 * @return the status of this pet entry
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this pet entry.
	 *
	 * @param status the status of this pet entry
	 */
	public void setStatus(String status);

	/**
	 * Returns the status date of this pet entry.
	 *
	 * @return the status date of this pet entry
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this pet entry.
	 *
	 * @param statusDate the status date of this pet entry
	 */
	public void setStatusDate(Date statusDate);

}