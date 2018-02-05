package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.List;

public class NeededNeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NeededNeedExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andNeededIdIsNull() {
            addCriterion("needed_id is null");
            return (Criteria) this;
        }

        public Criteria andNeededIdIsNotNull() {
            addCriterion("needed_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeededIdEqualTo(Integer value) {
            addCriterion("needed_id =", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdNotEqualTo(Integer value) {
            addCriterion("needed_id <>", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdGreaterThan(Integer value) {
            addCriterion("needed_id >", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("needed_id >=", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdLessThan(Integer value) {
            addCriterion("needed_id <", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdLessThanOrEqualTo(Integer value) {
            addCriterion("needed_id <=", value, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdIn(List<Integer> values) {
            addCriterion("needed_id in", values, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdNotIn(List<Integer> values) {
            addCriterion("needed_id not in", values, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdBetween(Integer value1, Integer value2) {
            addCriterion("needed_id between", value1, value2, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeededIdNotBetween(Integer value1, Integer value2) {
            addCriterion("needed_id not between", value1, value2, "neededId");
            return (Criteria) this;
        }

        public Criteria andNeedIdIsNull() {
            addCriterion("need_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedIdIsNotNull() {
            addCriterion("need_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedIdEqualTo(Integer value) {
            addCriterion("need_id =", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdNotEqualTo(Integer value) {
            addCriterion("need_id <>", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdGreaterThan(Integer value) {
            addCriterion("need_id >", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_id >=", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdLessThan(Integer value) {
            addCriterion("need_id <", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdLessThanOrEqualTo(Integer value) {
            addCriterion("need_id <=", value, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdIn(List<Integer> values) {
            addCriterion("need_id in", values, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdNotIn(List<Integer> values) {
            addCriterion("need_id not in", values, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdBetween(Integer value1, Integer value2) {
            addCriterion("need_id between", value1, value2, "needId");
            return (Criteria) this;
        }

        public Criteria andNeedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("need_id not between", value1, value2, "needId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNeededNameIsNull() {
            addCriterion("needed_name is null");
            return (Criteria) this;
        }

        public Criteria andNeededNameIsNotNull() {
            addCriterion("needed_name is not null");
            return (Criteria) this;
        }

        public Criteria andNeededNameEqualTo(String value) {
            addCriterion("needed_name =", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameNotEqualTo(String value) {
            addCriterion("needed_name <>", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameGreaterThan(String value) {
            addCriterion("needed_name >", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameGreaterThanOrEqualTo(String value) {
            addCriterion("needed_name >=", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameLessThan(String value) {
            addCriterion("needed_name <", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameLessThanOrEqualTo(String value) {
            addCriterion("needed_name <=", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameLike(String value) {
            addCriterion("needed_name like", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameNotLike(String value) {
            addCriterion("needed_name not like", value, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameIn(List<String> values) {
            addCriterion("needed_name in", values, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameNotIn(List<String> values) {
            addCriterion("needed_name not in", values, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameBetween(String value1, String value2) {
            addCriterion("needed_name between", value1, value2, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededNameNotBetween(String value1, String value2) {
            addCriterion("needed_name not between", value1, value2, "neededName");
            return (Criteria) this;
        }

        public Criteria andNeededAddressIsNull() {
            addCriterion("needed_address is null");
            return (Criteria) this;
        }

        public Criteria andNeededAddressIsNotNull() {
            addCriterion("needed_address is not null");
            return (Criteria) this;
        }

        public Criteria andNeededAddressEqualTo(String value) {
            addCriterion("needed_address =", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressNotEqualTo(String value) {
            addCriterion("needed_address <>", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressGreaterThan(String value) {
            addCriterion("needed_address >", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressGreaterThanOrEqualTo(String value) {
            addCriterion("needed_address >=", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressLessThan(String value) {
            addCriterion("needed_address <", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressLessThanOrEqualTo(String value) {
            addCriterion("needed_address <=", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressLike(String value) {
            addCriterion("needed_address like", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressNotLike(String value) {
            addCriterion("needed_address not like", value, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressIn(List<String> values) {
            addCriterion("needed_address in", values, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressNotIn(List<String> values) {
            addCriterion("needed_address not in", values, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressBetween(String value1, String value2) {
            addCriterion("needed_address between", value1, value2, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededAddressNotBetween(String value1, String value2) {
            addCriterion("needed_address not between", value1, value2, "neededAddress");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneIsNull() {
            addCriterion("needed_phone is null");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneIsNotNull() {
            addCriterion("needed_phone is not null");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneEqualTo(String value) {
            addCriterion("needed_phone =", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneNotEqualTo(String value) {
            addCriterion("needed_phone <>", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneGreaterThan(String value) {
            addCriterion("needed_phone >", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("needed_phone >=", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneLessThan(String value) {
            addCriterion("needed_phone <", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneLessThanOrEqualTo(String value) {
            addCriterion("needed_phone <=", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneLike(String value) {
            addCriterion("needed_phone like", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneNotLike(String value) {
            addCriterion("needed_phone not like", value, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneIn(List<String> values) {
            addCriterion("needed_phone in", values, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneNotIn(List<String> values) {
            addCriterion("needed_phone not in", values, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneBetween(String value1, String value2) {
            addCriterion("needed_phone between", value1, value2, "neededPhone");
            return (Criteria) this;
        }

        public Criteria andNeededPhoneNotBetween(String value1, String value2) {
            addCriterion("needed_phone not between", value1, value2, "neededPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}