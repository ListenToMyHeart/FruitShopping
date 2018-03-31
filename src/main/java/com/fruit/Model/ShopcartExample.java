package com.fruit.Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ShopcartExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andGoodspkidIsNull() {
            addCriterion("goodspkid is null");
            return (Criteria) this;
        }

        public Criteria andGoodspkidIsNotNull() {
            addCriterion("goodspkid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspkidEqualTo(Integer value) {
            addCriterion("goodspkid =", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidNotEqualTo(Integer value) {
            addCriterion("goodspkid <>", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidGreaterThan(Integer value) {
            addCriterion("goodspkid >", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodspkid >=", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidLessThan(Integer value) {
            addCriterion("goodspkid <", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidLessThanOrEqualTo(Integer value) {
            addCriterion("goodspkid <=", value, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidIn(List<Integer> values) {
            addCriterion("goodspkid in", values, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidNotIn(List<Integer> values) {
            addCriterion("goodspkid not in", values, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidBetween(Integer value1, Integer value2) {
            addCriterion("goodspkid between", value1, value2, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andGoodspkidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodspkid not between", value1, value2, "goodspkid");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andCartidIsNull() {
            addCriterion("cartid is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartid is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("cartid =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("cartid <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("cartid >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartid >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("cartid <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("cartid <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("cartid in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("cartid not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("cartid between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartid not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsid like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsid not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(BigDecimal value) {
            addCriterion("goodsprice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(BigDecimal value) {
            addCriterion("goodsprice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(BigDecimal value) {
            addCriterion("goodsprice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsprice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(BigDecimal value) {
            addCriterion("goodsprice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsprice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<BigDecimal> values) {
            addCriterion("goodsprice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<BigDecimal> values) {
            addCriterion("goodsprice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsprice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsprice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classid like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classid not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalprice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(BigDecimal value) {
            addCriterion("totalprice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("totalprice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("totalprice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(BigDecimal value) {
            addCriterion("totalprice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<BigDecimal> values) {
            addCriterion("totalprice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("totalprice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("goodsnumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("goodsnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(Integer value) {
            addCriterion("goodsnumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(Integer value) {
            addCriterion("goodsnumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(Integer value) {
            addCriterion("goodsnumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsnumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(Integer value) {
            addCriterion("goodsnumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("goodsnumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<Integer> values) {
            addCriterion("goodsnumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<Integer> values) {
            addCriterion("goodsnumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(Integer value1, Integer value2) {
            addCriterion("goodsnumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsnumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andCartstatusIsNull() {
            addCriterion("cartstatus is null");
            return (Criteria) this;
        }

        public Criteria andCartstatusIsNotNull() {
            addCriterion("cartstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCartstatusEqualTo(String value) {
            addCriterion("cartstatus =", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotEqualTo(String value) {
            addCriterion("cartstatus <>", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusGreaterThan(String value) {
            addCriterion("cartstatus >", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cartstatus >=", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusLessThan(String value) {
            addCriterion("cartstatus <", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusLessThanOrEqualTo(String value) {
            addCriterion("cartstatus <=", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusLike(String value) {
            addCriterion("cartstatus like", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotLike(String value) {
            addCriterion("cartstatus not like", value, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusIn(List<String> values) {
            addCriterion("cartstatus in", values, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotIn(List<String> values) {
            addCriterion("cartstatus not in", values, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusBetween(String value1, String value2) {
            addCriterion("cartstatus between", value1, value2, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andCartstatusNotBetween(String value1, String value2) {
            addCriterion("cartstatus not between", value1, value2, "cartstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIsNull() {
            addCriterion("goodsurl is null");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIsNotNull() {
            addCriterion("goodsurl is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsurlEqualTo(String value) {
            addCriterion("goodsurl =", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotEqualTo(String value) {
            addCriterion("goodsurl <>", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlGreaterThan(String value) {
            addCriterion("goodsurl >", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlGreaterThanOrEqualTo(String value) {
            addCriterion("goodsurl >=", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLessThan(String value) {
            addCriterion("goodsurl <", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLessThanOrEqualTo(String value) {
            addCriterion("goodsurl <=", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLike(String value) {
            addCriterion("goodsurl like", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotLike(String value) {
            addCriterion("goodsurl not like", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIn(List<String> values) {
            addCriterion("goodsurl in", values, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotIn(List<String> values) {
            addCriterion("goodsurl not in", values, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlBetween(String value1, String value2) {
            addCriterion("goodsurl between", value1, value2, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotBetween(String value1, String value2) {
            addCriterion("goodsurl not between", value1, value2, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceIsNull() {
            addCriterion("goodspreprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceIsNotNull() {
            addCriterion("goodspreprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceEqualTo(BigDecimal value) {
            addCriterion("goodspreprice =", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceNotEqualTo(BigDecimal value) {
            addCriterion("goodspreprice <>", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceGreaterThan(BigDecimal value) {
            addCriterion("goodspreprice >", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodspreprice >=", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceLessThan(BigDecimal value) {
            addCriterion("goodspreprice <", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodspreprice <=", value, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceIn(List<BigDecimal> values) {
            addCriterion("goodspreprice in", values, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceNotIn(List<BigDecimal> values) {
            addCriterion("goodspreprice not in", values, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodspreprice between", value1, value2, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsprepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodspreprice not between", value1, value2, "goodspreprice");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIsNull() {
            addCriterion("goodsintroduce is null");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIsNotNull() {
            addCriterion("goodsintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceEqualTo(String value) {
            addCriterion("goodsintroduce =", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotEqualTo(String value) {
            addCriterion("goodsintroduce <>", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceGreaterThan(String value) {
            addCriterion("goodsintroduce >", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("goodsintroduce >=", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLessThan(String value) {
            addCriterion("goodsintroduce <", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLessThanOrEqualTo(String value) {
            addCriterion("goodsintroduce <=", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLike(String value) {
            addCriterion("goodsintroduce like", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotLike(String value) {
            addCriterion("goodsintroduce not like", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIn(List<String> values) {
            addCriterion("goodsintroduce in", values, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotIn(List<String> values) {
            addCriterion("goodsintroduce not in", values, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceBetween(String value1, String value2) {
            addCriterion("goodsintroduce between", value1, value2, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotBetween(String value1, String value2) {
            addCriterion("goodsintroduce not between", value1, value2, "goodsintroduce");
            return (Criteria) this;
        }
    }

    /**
     */
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