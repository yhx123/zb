package com.lsjs.zb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerExample() {
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

        public Criteria andServerTitleIsNull() {
            addCriterion("server_title is null");
            return (Criteria) this;
        }

        public Criteria andServerTitleIsNotNull() {
            addCriterion("server_title is not null");
            return (Criteria) this;
        }

        public Criteria andServerTitleEqualTo(String value) {
            addCriterion("server_title =", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleNotEqualTo(String value) {
            addCriterion("server_title <>", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleGreaterThan(String value) {
            addCriterion("server_title >", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("server_title >=", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleLessThan(String value) {
            addCriterion("server_title <", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleLessThanOrEqualTo(String value) {
            addCriterion("server_title <=", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleLike(String value) {
            addCriterion("server_title like", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleNotLike(String value) {
            addCriterion("server_title not like", value, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleIn(List<String> values) {
            addCriterion("server_title in", values, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleNotIn(List<String> values) {
            addCriterion("server_title not in", values, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleBetween(String value1, String value2) {
            addCriterion("server_title between", value1, value2, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerTitleNotBetween(String value1, String value2) {
            addCriterion("server_title not between", value1, value2, "serverTitle");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionIsNull() {
            addCriterion("server_description is null");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionIsNotNull() {
            addCriterion("server_description is not null");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionEqualTo(String value) {
            addCriterion("server_description =", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionNotEqualTo(String value) {
            addCriterion("server_description <>", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionGreaterThan(String value) {
            addCriterion("server_description >", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("server_description >=", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionLessThan(String value) {
            addCriterion("server_description <", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionLessThanOrEqualTo(String value) {
            addCriterion("server_description <=", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionLike(String value) {
            addCriterion("server_description like", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionNotLike(String value) {
            addCriterion("server_description not like", value, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionIn(List<String> values) {
            addCriterion("server_description in", values, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionNotIn(List<String> values) {
            addCriterion("server_description not in", values, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionBetween(String value1, String value2) {
            addCriterion("server_description between", value1, value2, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andServerDescriptionNotBetween(String value1, String value2) {
            addCriterion("server_description not between", value1, value2, "serverDescription");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andServerTimeIsNull() {
            addCriterion("server_time is null");
            return (Criteria) this;
        }

        public Criteria andServerTimeIsNotNull() {
            addCriterion("server_time is not null");
            return (Criteria) this;
        }

        public Criteria andServerTimeEqualTo(Long value) {
            addCriterion("server_time =", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotEqualTo(Long value) {
            addCriterion("server_time <>", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeGreaterThan(Long value) {
            addCriterion("server_time >", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("server_time >=", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeLessThan(Long value) {
            addCriterion("server_time <", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeLessThanOrEqualTo(Long value) {
            addCriterion("server_time <=", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeIn(List<Long> values) {
            addCriterion("server_time in", values, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotIn(List<Long> values) {
            addCriterion("server_time not in", values, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeBetween(Long value1, Long value2) {
            addCriterion("server_time between", value1, value2, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotBetween(Long value1, Long value2) {
            addCriterion("server_time not between", value1, value2, "serverTime");
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

        public Criteria andServerStatusIsNull() {
            addCriterion("server_status is null");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNotNull() {
            addCriterion("server_status is not null");
            return (Criteria) this;
        }

        public Criteria andServerStatusEqualTo(Integer value) {
            addCriterion("server_status =", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotEqualTo(Integer value) {
            addCriterion("server_status <>", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThan(Integer value) {
            addCriterion("server_status >", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_status >=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThan(Integer value) {
            addCriterion("server_status <", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("server_status <=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusIn(List<Integer> values) {
            addCriterion("server_status in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotIn(List<Integer> values) {
            addCriterion("server_status not in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusBetween(Integer value1, Integer value2) {
            addCriterion("server_status between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("server_status not between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(Integer value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(Integer value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(Integer value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(Integer value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<Integer> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<Integer> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(Integer value1, Integer value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeIsNull() {
            addCriterion("server_latitude is null");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeIsNotNull() {
            addCriterion("server_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeEqualTo(String value) {
            addCriterion("server_latitude =", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeNotEqualTo(String value) {
            addCriterion("server_latitude <>", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeGreaterThan(String value) {
            addCriterion("server_latitude >", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("server_latitude >=", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeLessThan(String value) {
            addCriterion("server_latitude <", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeLessThanOrEqualTo(String value) {
            addCriterion("server_latitude <=", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeLike(String value) {
            addCriterion("server_latitude like", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeNotLike(String value) {
            addCriterion("server_latitude not like", value, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeIn(List<String> values) {
            addCriterion("server_latitude in", values, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeNotIn(List<String> values) {
            addCriterion("server_latitude not in", values, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeBetween(String value1, String value2) {
            addCriterion("server_latitude between", value1, value2, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLatitudeNotBetween(String value1, String value2) {
            addCriterion("server_latitude not between", value1, value2, "serverLatitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeIsNull() {
            addCriterion("server_longitude is null");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeIsNotNull() {
            addCriterion("server_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeEqualTo(String value) {
            addCriterion("server_longitude =", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeNotEqualTo(String value) {
            addCriterion("server_longitude <>", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeGreaterThan(String value) {
            addCriterion("server_longitude >", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("server_longitude >=", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeLessThan(String value) {
            addCriterion("server_longitude <", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeLessThanOrEqualTo(String value) {
            addCriterion("server_longitude <=", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeLike(String value) {
            addCriterion("server_longitude like", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeNotLike(String value) {
            addCriterion("server_longitude not like", value, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeIn(List<String> values) {
            addCriterion("server_longitude in", values, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeNotIn(List<String> values) {
            addCriterion("server_longitude not in", values, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeBetween(String value1, String value2) {
            addCriterion("server_longitude between", value1, value2, "serverLongitude");
            return (Criteria) this;
        }

        public Criteria andServerLongitudeNotBetween(String value1, String value2) {
            addCriterion("server_longitude not between", value1, value2, "serverLongitude");
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

        public Criteria andServerImgIsNull() {
            addCriterion("server_img is null");
            return (Criteria) this;
        }

        public Criteria andServerImgIsNotNull() {
            addCriterion("server_img is not null");
            return (Criteria) this;
        }

        public Criteria andServerImgEqualTo(String value) {
            addCriterion("server_img =", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgNotEqualTo(String value) {
            addCriterion("server_img <>", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgGreaterThan(String value) {
            addCriterion("server_img >", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgGreaterThanOrEqualTo(String value) {
            addCriterion("server_img >=", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgLessThan(String value) {
            addCriterion("server_img <", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgLessThanOrEqualTo(String value) {
            addCriterion("server_img <=", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgLike(String value) {
            addCriterion("server_img like", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgNotLike(String value) {
            addCriterion("server_img not like", value, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgIn(List<String> values) {
            addCriterion("server_img in", values, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgNotIn(List<String> values) {
            addCriterion("server_img not in", values, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgBetween(String value1, String value2) {
            addCriterion("server_img between", value1, value2, "serverImg");
            return (Criteria) this;
        }

        public Criteria andServerImgNotBetween(String value1, String value2) {
            addCriterion("server_img not between", value1, value2, "serverImg");
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