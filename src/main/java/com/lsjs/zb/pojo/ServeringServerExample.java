package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServeringServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServeringServerExample() {
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

        public Criteria andServeringIdIsNull() {
            addCriterion("servering_id is null");
            return (Criteria) this;
        }

        public Criteria andServeringIdIsNotNull() {
            addCriterion("servering_id is not null");
            return (Criteria) this;
        }

        public Criteria andServeringIdEqualTo(Integer value) {
            addCriterion("servering_id =", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdNotEqualTo(Integer value) {
            addCriterion("servering_id <>", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdGreaterThan(Integer value) {
            addCriterion("servering_id >", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("servering_id >=", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdLessThan(Integer value) {
            addCriterion("servering_id <", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdLessThanOrEqualTo(Integer value) {
            addCriterion("servering_id <=", value, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdIn(List<Integer> values) {
            addCriterion("servering_id in", values, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdNotIn(List<Integer> values) {
            addCriterion("servering_id not in", values, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdBetween(Integer value1, Integer value2) {
            addCriterion("servering_id between", value1, value2, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServeringIdNotBetween(Integer value1, Integer value2) {
            addCriterion("servering_id not between", value1, value2, "serveringId");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
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

        public Criteria andServerNameIsNull() {
            addCriterion("server_name is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("server_name is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("server_name =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("server_name <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("server_name >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("server_name >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("server_name <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("server_name <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("server_name like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("server_name not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("server_name in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("server_name not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("server_name between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("server_name not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerPhoneIsNull() {
            addCriterion("server_phone is null");
            return (Criteria) this;
        }

        public Criteria andServerPhoneIsNotNull() {
            addCriterion("server_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServerPhoneEqualTo(String value) {
            addCriterion("server_phone =", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneNotEqualTo(String value) {
            addCriterion("server_phone <>", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneGreaterThan(String value) {
            addCriterion("server_phone >", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("server_phone >=", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneLessThan(String value) {
            addCriterion("server_phone <", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneLessThanOrEqualTo(String value) {
            addCriterion("server_phone <=", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneLike(String value) {
            addCriterion("server_phone like", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneNotLike(String value) {
            addCriterion("server_phone not like", value, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneIn(List<String> values) {
            addCriterion("server_phone in", values, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneNotIn(List<String> values) {
            addCriterion("server_phone not in", values, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneBetween(String value1, String value2) {
            addCriterion("server_phone between", value1, value2, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerPhoneNotBetween(String value1, String value2) {
            addCriterion("server_phone not between", value1, value2, "serverPhone");
            return (Criteria) this;
        }

        public Criteria andServerAddressIsNull() {
            addCriterion("server_address is null");
            return (Criteria) this;
        }

        public Criteria andServerAddressIsNotNull() {
            addCriterion("server_address is not null");
            return (Criteria) this;
        }

        public Criteria andServerAddressEqualTo(String value) {
            addCriterion("server_address =", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressNotEqualTo(String value) {
            addCriterion("server_address <>", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressGreaterThan(String value) {
            addCriterion("server_address >", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("server_address >=", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressLessThan(String value) {
            addCriterion("server_address <", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressLessThanOrEqualTo(String value) {
            addCriterion("server_address <=", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressLike(String value) {
            addCriterion("server_address like", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressNotLike(String value) {
            addCriterion("server_address not like", value, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressIn(List<String> values) {
            addCriterion("server_address in", values, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressNotIn(List<String> values) {
            addCriterion("server_address not in", values, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressBetween(String value1, String value2) {
            addCriterion("server_address between", value1, value2, "serverAddress");
            return (Criteria) this;
        }

        public Criteria andServerAddressNotBetween(String value1, String value2) {
            addCriterion("server_address not between", value1, value2, "serverAddress");
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