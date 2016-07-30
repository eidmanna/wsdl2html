package org.jaxws.integrationtest.exampleWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * 
 * @author chenjianjx@gmail.com
 *
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Post {

	/**
	 * post id
	 */
	@XmlElement(required = true)
	protected Long id;

	/**
	 * the author's userId
	 */
	@XmlElement(required = true)
	protected Long userId;

	/**
	 * the post's content
	 */
	@XmlElement(required = true)
	protected String content;

	/**
	 * can this post be deleted by current user?
	 */
	@XmlElement(required = false)
	protected Boolean canDelete = Boolean.FALSE;

	/**
	 * can this post be updated by current user?
	 */
	@XmlElement(required = false)
	protected Boolean canUpdate = Boolean.FALSE;

	public Boolean getCanDelete() {
		return canDelete;
	}

	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}

	public Boolean getCanUpdate() {
		return canUpdate;
	}

	public void setCanUpdate(Boolean canUpdate) {
		this.canUpdate = canUpdate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
