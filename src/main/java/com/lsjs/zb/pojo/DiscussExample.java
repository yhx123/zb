package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.List;

public class DiscussExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussExample() {
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

        public Criteria andDiscussIdIsNull() {
            addCriterion("discuss_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIsNotNull() {
            addCriterion("discuss_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdEqualTo(Integer value) {
            addCriterion("discuss_id =", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotEqualTo(Integer value) {
            addCriterion("discuss_id <>", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThan(Integer value) {
            addCriterion("discuss_id >", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("discuss_id >=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThan(Integer value) {
            addCriterion("discuss_id <", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThanOrEqualTo(Integer value) {
            addCriterion("discuss_id <=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIn(List<Integer> values) {
            addCriterion("discuss_id in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotIn(List<Integer> values) {
            addCriterion("discuss_id not in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdBetween(Integer value1, Integer value2) {
            addCriterion("discuss_id between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotBetween(Integer value1, Integer value2) {
            addCriterion("discuss_id not between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNull() {
            addCriterion("child_id is null");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNotNull() {
            addCriterion("child_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildIdEqualTo(Integer value) {
            addCriterion("child_id =", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotEqualTo(Integer value) {
            addCriterion("child_id <>", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThan(Integer value) {
            addCriterion("child_id >", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_id >=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThan(Integer value) {
            addCriterion("child_id <", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_id <=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdIn(List<Integer> values) {
            addCriterion("child_id in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotIn(List<Integer> values) {
            addCriterion("child_id not in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdBetween(Integer value1, Integer value2) {
            addCriterion("child_id between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_id not between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdIsNull() {
            addCriterion("server_or_need_id is null");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdIsNotNull() {
            addCriterion("server_or_need_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdEqualTo(String value) {
            addCriterion("server_or_need_id =", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdNotEqualTo(String value) {
            addCriterion("server_or_need_id <>", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdGreaterThan(String value) {
            addCriterion("server_or_need_id >", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdGreaterThanOrEqualTo(String value) {
            addCriterion("server_or_need_id >=", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdLessThan(String value) {
            addCriterion("server_or_need_id <", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdLessThanOrEqualTo(String value) {
            addCriterion("server_or_need_id <=", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdLike(String value) {
            addCriterion("server_or_need_id like", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdNotLike(String value) {
            addCriterion("server_or_need_id not like", value, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdIn(List<String> values) {
            addCriterion("server_or_need_id in", values, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdNotIn(List<String> values) {
            addCriterion("server_or_need_id not in", values, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdBetween(String value1, String value2) {
            addCriterion("server_or_need_id between", value1, value2, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andServerOrNeedIdNotBetween(String value1, String value2) {
            addCriterion("server_or_need_id not between", value1, value2, "serverOrNeedId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDiscussImgIsNull() {
            addCriterion("discuss_img is null");
            return (Criteria) this;
        }

        public Criteria andDiscussImgIsNotNull() {
            addCriterion("discuss_img is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussImgEqualTo(String value) {
            addCriterion("discuss_img =", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgNotEqualTo(String value) {
            addCriterion("discuss_img <>", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgGreaterThan(String value) {
            addCriterion("discuss_img >", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_img >=", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgLessThan(String value) {
            addCriterion("discuss_img <", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgLessThanOrEqualTo(String value) {
            addCriterion("discuss_img <=", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgLike(String value) {
            addCriterion("discuss_img like", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgNotLike(String value) {
            addCriterion("discuss_img not like", value, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgIn(List<String> values) {
            addCriterion("discuss_img in", values, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgNotIn(List<String> values) {
            addCriterion("discuss_img not in", values, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgBetween(String value1, String value2) {
            addCriterion("discuss_img between", value1, value2, "discussImg");
            return (Criteria) this;
        }

        public Criteria andDiscussImgNotBetween(String value1, String value2) {
            addCriterion("discuss_img not between", value1, value2, "discussImg");
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