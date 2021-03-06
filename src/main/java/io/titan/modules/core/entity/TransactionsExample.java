package io.titan.modules.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public TransactionsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIsNull() {
			addCriterion("transaction_id is null");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIsNotNull() {
			addCriterion("transaction_id is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionIdEqualTo(String value) {
			addCriterion("transaction_id =", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotEqualTo(String value) {
			addCriterion("transaction_id <>", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdGreaterThan(String value) {
			addCriterion("transaction_id >", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
			addCriterion("transaction_id >=", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLessThan(String value) {
			addCriterion("transaction_id <", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLessThanOrEqualTo(String value) {
			addCriterion("transaction_id <=", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdLike(String value) {
			addCriterion("transaction_id like", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotLike(String value) {
			addCriterion("transaction_id not like", value, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdIn(List<String> values) {
			addCriterion("transaction_id in", values, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotIn(List<String> values) {
			addCriterion("transaction_id not in", values, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdBetween(String value1, String value2) {
			addCriterion("transaction_id between", value1, value2, "transactionId");
			return (Criteria) this;
		}

		public Criteria andTransactionIdNotBetween(String value1, String value2) {
			addCriterion("transaction_id not between", value1, value2, "transactionId");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andContractIsNull() {
			addCriterion("contract is null");
			return (Criteria) this;
		}

		public Criteria andContractIsNotNull() {
			addCriterion("contract is not null");
			return (Criteria) this;
		}

		public Criteria andContractEqualTo(String value) {
			addCriterion("contract =", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractNotEqualTo(String value) {
			addCriterion("contract <>", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractGreaterThan(String value) {
			addCriterion("contract >", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractGreaterThanOrEqualTo(String value) {
			addCriterion("contract >=", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractLessThan(String value) {
			addCriterion("contract <", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractLessThanOrEqualTo(String value) {
			addCriterion("contract <=", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractLike(String value) {
			addCriterion("contract like", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractNotLike(String value) {
			addCriterion("contract not like", value, "contract");
			return (Criteria) this;
		}

		public Criteria andContractIn(List<String> values) {
			addCriterion("contract in", values, "contract");
			return (Criteria) this;
		}

		public Criteria andContractNotIn(List<String> values) {
			addCriterion("contract not in", values, "contract");
			return (Criteria) this;
		}

		public Criteria andContractBetween(String value1, String value2) {
			addCriterion("contract between", value1, value2, "contract");
			return (Criteria) this;
		}

		public Criteria andContractNotBetween(String value1, String value2) {
			addCriterion("contract not between", value1, value2, "contract");
			return (Criteria) this;
		}

		public Criteria andSenderIsNull() {
			addCriterion("sender is null");
			return (Criteria) this;
		}

		public Criteria andSenderIsNotNull() {
			addCriterion("sender is not null");
			return (Criteria) this;
		}

		public Criteria andSenderEqualTo(String value) {
			addCriterion("sender =", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderNotEqualTo(String value) {
			addCriterion("sender <>", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderGreaterThan(String value) {
			addCriterion("sender >", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderGreaterThanOrEqualTo(String value) {
			addCriterion("sender >=", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderLessThan(String value) {
			addCriterion("sender <", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderLessThanOrEqualTo(String value) {
			addCriterion("sender <=", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderLike(String value) {
			addCriterion("sender like", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderNotLike(String value) {
			addCriterion("sender not like", value, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderIn(List<String> values) {
			addCriterion("sender in", values, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderNotIn(List<String> values) {
			addCriterion("sender not in", values, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderBetween(String value1, String value2) {
			addCriterion("sender between", value1, value2, "sender");
			return (Criteria) this;
		}

		public Criteria andSenderNotBetween(String value1, String value2) {
			addCriterion("sender not between", value1, value2, "sender");
			return (Criteria) this;
		}

		public Criteria andRecipientIsNull() {
			addCriterion("recipient is null");
			return (Criteria) this;
		}

		public Criteria andRecipientIsNotNull() {
			addCriterion("recipient is not null");
			return (Criteria) this;
		}

		public Criteria andRecipientEqualTo(String value) {
			addCriterion("recipient =", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientNotEqualTo(String value) {
			addCriterion("recipient <>", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientGreaterThan(String value) {
			addCriterion("recipient >", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientGreaterThanOrEqualTo(String value) {
			addCriterion("recipient >=", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientLessThan(String value) {
			addCriterion("recipient <", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientLessThanOrEqualTo(String value) {
			addCriterion("recipient <=", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientLike(String value) {
			addCriterion("recipient like", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientNotLike(String value) {
			addCriterion("recipient not like", value, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientIn(List<String> values) {
			addCriterion("recipient in", values, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientNotIn(List<String> values) {
			addCriterion("recipient not in", values, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientBetween(String value1, String value2) {
			addCriterion("recipient between", value1, value2, "recipient");
			return (Criteria) this;
		}

		public Criteria andRecipientNotBetween(String value1, String value2) {
			addCriterion("recipient not between", value1, value2, "recipient");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(Long value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(Long value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(Long value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(Long value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(Long value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(Long value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<Long> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<Long> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(Long value1, Long value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(Long value1, Long value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andNonceIsNull() {
			addCriterion("nonce is null");
			return (Criteria) this;
		}

		public Criteria andNonceIsNotNull() {
			addCriterion("nonce is not null");
			return (Criteria) this;
		}

		public Criteria andNonceEqualTo(String value) {
			addCriterion("nonce =", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceNotEqualTo(String value) {
			addCriterion("nonce <>", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceGreaterThan(String value) {
			addCriterion("nonce >", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceGreaterThanOrEqualTo(String value) {
			addCriterion("nonce >=", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceLessThan(String value) {
			addCriterion("nonce <", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceLessThanOrEqualTo(String value) {
			addCriterion("nonce <=", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceLike(String value) {
			addCriterion("nonce like", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceNotLike(String value) {
			addCriterion("nonce not like", value, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceIn(List<String> values) {
			addCriterion("nonce in", values, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceNotIn(List<String> values) {
			addCriterion("nonce not in", values, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceBetween(String value1, String value2) {
			addCriterion("nonce between", value1, value2, "nonce");
			return (Criteria) this;
		}

		public Criteria andNonceNotBetween(String value1, String value2) {
			addCriterion("nonce not between", value1, value2, "nonce");
			return (Criteria) this;
		}

		public Criteria andGasIsNull() {
			addCriterion("gas is null");
			return (Criteria) this;
		}

		public Criteria andGasIsNotNull() {
			addCriterion("gas is not null");
			return (Criteria) this;
		}

		public Criteria andGasEqualTo(Long value) {
			addCriterion("gas =", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasNotEqualTo(Long value) {
			addCriterion("gas <>", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasGreaterThan(Long value) {
			addCriterion("gas >", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasGreaterThanOrEqualTo(Long value) {
			addCriterion("gas >=", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasLessThan(Long value) {
			addCriterion("gas <", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasLessThanOrEqualTo(Long value) {
			addCriterion("gas <=", value, "gas");
			return (Criteria) this;
		}

		public Criteria andGasIn(List<Long> values) {
			addCriterion("gas in", values, "gas");
			return (Criteria) this;
		}

		public Criteria andGasNotIn(List<Long> values) {
			addCriterion("gas not in", values, "gas");
			return (Criteria) this;
		}

		public Criteria andGasBetween(Long value1, Long value2) {
			addCriterion("gas between", value1, value2, "gas");
			return (Criteria) this;
		}

		public Criteria andGasNotBetween(Long value1, Long value2) {
			addCriterion("gas not between", value1, value2, "gas");
			return (Criteria) this;
		}

		public Criteria andBlockIdIsNull() {
			addCriterion("block_id is null");
			return (Criteria) this;
		}

		public Criteria andBlockIdIsNotNull() {
			addCriterion("block_id is not null");
			return (Criteria) this;
		}

		public Criteria andBlockIdEqualTo(String value) {
			addCriterion("block_id =", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdNotEqualTo(String value) {
			addCriterion("block_id <>", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdGreaterThan(String value) {
			addCriterion("block_id >", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdGreaterThanOrEqualTo(String value) {
			addCriterion("block_id >=", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdLessThan(String value) {
			addCriterion("block_id <", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdLessThanOrEqualTo(String value) {
			addCriterion("block_id <=", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdLike(String value) {
			addCriterion("block_id like", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdNotLike(String value) {
			addCriterion("block_id not like", value, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdIn(List<String> values) {
			addCriterion("block_id in", values, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdNotIn(List<String> values) {
			addCriterion("block_id not in", values, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdBetween(String value1, String value2) {
			addCriterion("block_id between", value1, value2, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockIdNotBetween(String value1, String value2) {
			addCriterion("block_id not between", value1, value2, "blockId");
			return (Criteria) this;
		}

		public Criteria andBlockNumberIsNull() {
			addCriterion("block_number is null");
			return (Criteria) this;
		}

		public Criteria andBlockNumberIsNotNull() {
			addCriterion("block_number is not null");
			return (Criteria) this;
		}

		public Criteria andBlockNumberEqualTo(Long value) {
			addCriterion("block_number =", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotEqualTo(Long value) {
			addCriterion("block_number <>", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberGreaterThan(Long value) {
			addCriterion("block_number >", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberGreaterThanOrEqualTo(Long value) {
			addCriterion("block_number >=", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberLessThan(Long value) {
			addCriterion("block_number <", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberLessThanOrEqualTo(Long value) {
			addCriterion("block_number <=", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberIn(List<Long> values) {
			addCriterion("block_number in", values, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotIn(List<Long> values) {
			addCriterion("block_number not in", values, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberBetween(Long value1, Long value2) {
			addCriterion("block_number between", value1, value2, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotBetween(Long value1, Long value2) {
			addCriterion("block_number not between", value1, value2, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockTimeIsNull() {
			addCriterion("block_time is null");
			return (Criteria) this;
		}

		public Criteria andBlockTimeIsNotNull() {
			addCriterion("block_time is not null");
			return (Criteria) this;
		}

		public Criteria andBlockTimeEqualTo(Date value) {
			addCriterion("block_time =", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeNotEqualTo(Date value) {
			addCriterion("block_time <>", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeGreaterThan(Date value) {
			addCriterion("block_time >", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("block_time >=", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeLessThan(Date value) {
			addCriterion("block_time <", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeLessThanOrEqualTo(Date value) {
			addCriterion("block_time <=", value, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeIn(List<Date> values) {
			addCriterion("block_time in", values, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeNotIn(List<Date> values) {
			addCriterion("block_time not in", values, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeBetween(Date value1, Date value2) {
			addCriterion("block_time between", value1, value2, "blockTime");
			return (Criteria) this;
		}

		public Criteria andBlockTimeNotBetween(Date value1, Date value2) {
			addCriterion("block_time not between", value1, value2, "blockTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transactions
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 09 17:57:10 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}