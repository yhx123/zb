package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditDetailExample() {
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

        public Criteria andCreditDetailIdIsNull() {
            addCriterion("credit_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdIsNotNull() {
            addCriterion("credit_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdEqualTo(Integer value) {
            addCriterion("credit_detail_id =", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotEqualTo(Integer value) {
            addCriterion("credit_detail_id <>", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdGreaterThan(Integer value) {
            addCriterion("credit_detail_id >", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_detail_id >=", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdLessThan(Integer value) {
            addCriterion("credit_detail_id <", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("credit_detail_id <=", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdIn(List<Integer> values) {
            addCriterion("credit_detail_id in", values, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotIn(List<Integer> values) {
            addCriterion("credit_detail_id not in", values, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("credit_detail_id between", value1, value2, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_detail_id not between", value1, value2, "creditDetailId");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andActivelityIsNull() {
            addCriterion("activelity is null");
            return (Criteria) this;
        }

        public Criteria andActivelityIsNotNull() {
            addCriterion("activelity is not null");
            return (Criteria) this;
        }

        public Criteria andActivelityEqualTo(String value) {
            addCriterion("activelity =", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityNotEqualTo(String value) {
            addCriterion("activelity <>", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityGreaterThan(String value) {
            addCriterion("activelity >", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityGreaterThanOrEqualTo(String value) {
            addCriterion("activelity >=", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityLessThan(String value) {
            addCriterion("activelity <", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityLessThanOrEqualTo(String value) {
            addCriterion("activelity <=", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityLike(String value) {
            addCriterion("activelity like", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityNotLike(String value) {
            addCriterion("activelity not like", value, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityIn(List<String> values) {
            addCriterion("activelity in", values, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityNotIn(List<String> values) {
            addCriterion("activelity not in", values, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityBetween(String value1, String value2) {
            addCriterion("activelity between", value1, value2, "activelity");
            return (Criteria) this;
        }

        public Criteria andActivelityNotBetween(String value1, String value2) {
            addCriterion("activelity not between", value1, value2, "activelity");
            return (Criteria) this;
        }

        public Criteria andScoreChageIsNull() {
            addCriterion("score_chage is null");
            return (Criteria) this;
        }

        public Criteria andScoreChageIsNotNull() {
            addCriterion("score_chage is not null");
            return (Criteria) this;
        }

        public Criteria andScoreChageEqualTo(String value) {
            addCriterion("score_chage =", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageNotEqualTo(String value) {
            addCriterion("score_chage <>", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageGreaterThan(String value) {
            addCriterion("score_chage >", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageGreaterThanOrEqualTo(String value) {
            addCriterion("score_chage >=", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageLessThan(String value) {
            addCriterion("score_chage <", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageLessThanOrEqualTo(String value) {
            addCriterion("score_chage <=", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageLike(String value) {
            addCriterion("score_chage like", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageNotLike(String value) {
            addCriterion("score_chage not like", value, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageIn(List<String> values) {
            addCriterion("score_chage in", values, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageNotIn(List<String> values) {
            addCriterion("score_chage not in", values, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageBetween(String value1, String value2) {
            addCriterion("score_chage between", value1, value2, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andScoreChageNotBetween(String value1, String value2) {
            addCriterion("score_chage not between", value1, value2, "scoreChage");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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