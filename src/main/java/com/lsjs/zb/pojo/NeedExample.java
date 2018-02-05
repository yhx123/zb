package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NeedExample() {
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

        public Criteria andNeedTitleIsNull() {
            addCriterion("need_title is null");
            return (Criteria) this;
        }

        public Criteria andNeedTitleIsNotNull() {
            addCriterion("need_title is not null");
            return (Criteria) this;
        }

        public Criteria andNeedTitleEqualTo(String value) {
            addCriterion("need_title =", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleNotEqualTo(String value) {
            addCriterion("need_title <>", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleGreaterThan(String value) {
            addCriterion("need_title >", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleGreaterThanOrEqualTo(String value) {
            addCriterion("need_title >=", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleLessThan(String value) {
            addCriterion("need_title <", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleLessThanOrEqualTo(String value) {
            addCriterion("need_title <=", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleLike(String value) {
            addCriterion("need_title like", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleNotLike(String value) {
            addCriterion("need_title not like", value, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleIn(List<String> values) {
            addCriterion("need_title in", values, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleNotIn(List<String> values) {
            addCriterion("need_title not in", values, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleBetween(String value1, String value2) {
            addCriterion("need_title between", value1, value2, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedTitleNotBetween(String value1, String value2) {
            addCriterion("need_title not between", value1, value2, "needTitle");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionIsNull() {
            addCriterion("need_description is null");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionIsNotNull() {
            addCriterion("need_description is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionEqualTo(String value) {
            addCriterion("need_description =", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionNotEqualTo(String value) {
            addCriterion("need_description <>", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionGreaterThan(String value) {
            addCriterion("need_description >", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("need_description >=", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionLessThan(String value) {
            addCriterion("need_description <", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionLessThanOrEqualTo(String value) {
            addCriterion("need_description <=", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionLike(String value) {
            addCriterion("need_description like", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionNotLike(String value) {
            addCriterion("need_description not like", value, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionIn(List<String> values) {
            addCriterion("need_description in", values, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionNotIn(List<String> values) {
            addCriterion("need_description not in", values, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionBetween(String value1, String value2) {
            addCriterion("need_description between", value1, value2, "needDescription");
            return (Criteria) this;
        }

        public Criteria andNeedDescriptionNotBetween(String value1, String value2) {
            addCriterion("need_description not between", value1, value2, "needDescription");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(Long value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(Long value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(Long value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(Long value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(Long value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(Long value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<Long> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<Long> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(Long value1, Long value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(Long value1, Long value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIsNull() {
            addCriterion("need_type is null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIsNotNull() {
            addCriterion("need_type is not null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeEqualTo(Integer value) {
            addCriterion("need_type =", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotEqualTo(Integer value) {
            addCriterion("need_type <>", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeGreaterThan(Integer value) {
            addCriterion("need_type >", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_type >=", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeLessThan(Integer value) {
            addCriterion("need_type <", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("need_type <=", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIn(List<Integer> values) {
            addCriterion("need_type in", values, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotIn(List<Integer> values) {
            addCriterion("need_type not in", values, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeBetween(Integer value1, Integer value2) {
            addCriterion("need_type between", value1, value2, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("need_type not between", value1, value2, "needType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andNeedImgIsNull() {
            addCriterion("need_img is null");
            return (Criteria) this;
        }

        public Criteria andNeedImgIsNotNull() {
            addCriterion("need_img is not null");
            return (Criteria) this;
        }

        public Criteria andNeedImgEqualTo(String value) {
            addCriterion("need_img =", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgNotEqualTo(String value) {
            addCriterion("need_img <>", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgGreaterThan(String value) {
            addCriterion("need_img >", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgGreaterThanOrEqualTo(String value) {
            addCriterion("need_img >=", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgLessThan(String value) {
            addCriterion("need_img <", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgLessThanOrEqualTo(String value) {
            addCriterion("need_img <=", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgLike(String value) {
            addCriterion("need_img like", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgNotLike(String value) {
            addCriterion("need_img not like", value, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgIn(List<String> values) {
            addCriterion("need_img in", values, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgNotIn(List<String> values) {
            addCriterion("need_img not in", values, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgBetween(String value1, String value2) {
            addCriterion("need_img between", value1, value2, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedImgNotBetween(String value1, String value2) {
            addCriterion("need_img not between", value1, value2, "needImg");
            return (Criteria) this;
        }

        public Criteria andNeedTimeIsNull() {
            addCriterion("need_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedTimeIsNotNull() {
            addCriterion("need_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedTimeEqualTo(Long value) {
            addCriterion("need_time =", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeNotEqualTo(Long value) {
            addCriterion("need_time <>", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeGreaterThan(Long value) {
            addCriterion("need_time >", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("need_time >=", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeLessThan(Long value) {
            addCriterion("need_time <", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeLessThanOrEqualTo(Long value) {
            addCriterion("need_time <=", value, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeIn(List<Long> values) {
            addCriterion("need_time in", values, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeNotIn(List<Long> values) {
            addCriterion("need_time not in", values, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeBetween(Long value1, Long value2) {
            addCriterion("need_time between", value1, value2, "needTime");
            return (Criteria) this;
        }

        public Criteria andNeedTimeNotBetween(Long value1, Long value2) {
            addCriterion("need_time not between", value1, value2, "needTime");
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