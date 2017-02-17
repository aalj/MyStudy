package com.wdsunday.dao.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

/**
 * 所有数据库实体类基类，包括创建时间和事务锁版本
 */
@MappedSuperclass
public abstract class BaseTxVersionEntity implements Serializable {

	public static final String COL_NAME_VERSION = "VERSION";

	public BaseTxVersionEntity() {
	}

	/**
	 * 事务锁版本
	 */
	@Version
	@Column(name = COL_NAME_VERSION)
	protected Long txVersion = 0L;

	public Long getTxVersion() {
		return txVersion == null ? 0 : txVersion;
	}

	public void setTxVersion(Long version) {
		this.txVersion = version;
	}
}
