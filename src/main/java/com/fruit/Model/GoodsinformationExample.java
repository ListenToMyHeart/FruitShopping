package com.fruit.Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsinformationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPkidIsNull() {
            addCriterion("pkid is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("pkid is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(Integer value) {
            addCriterion("pkid =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(Integer value) {
            addCriterion("pkid <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(Integer value) {
            addCriterion("pkid >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkid >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(Integer value) {
            addCriterion("pkid <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(Integer value) {
            addCriterion("pkid <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<Integer> values) {
            addCriterion("pkid in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<Integer> values) {
            addCriterion("pkid not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(Integer value1, Integer value2) {
            addCriterion("pkid between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("pkid not between", value1, value2, "pkid");
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

        public Criteria andGoodsbrandIsNull() {
            addCriterion("goodsbrand is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandIsNotNull() {
            addCriterion("goodsbrand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandEqualTo(String value) {
            addCriterion("goodsbrand =", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotEqualTo(String value) {
            addCriterion("goodsbrand <>", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandGreaterThan(String value) {
            addCriterion("goodsbrand >", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandGreaterThanOrEqualTo(String value) {
            addCriterion("goodsbrand >=", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLessThan(String value) {
            addCriterion("goodsbrand <", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLessThanOrEqualTo(String value) {
            addCriterion("goodsbrand <=", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLike(String value) {
            addCriterion("goodsbrand like", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotLike(String value) {
            addCriterion("goodsbrand not like", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandIn(List<String> values) {
            addCriterion("goodsbrand in", values, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotIn(List<String> values) {
            addCriterion("goodsbrand not in", values, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandBetween(String value1, String value2) {
            addCriterion("goodsbrand between", value1, value2, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotBetween(String value1, String value2) {
            addCriterion("goodsbrand not between", value1, value2, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNull() {
            addCriterion("goodsunit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNotNull() {
            addCriterion("goodsunit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitEqualTo(String value) {
            addCriterion("goodsunit =", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotEqualTo(String value) {
            addCriterion("goodsunit <>", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThan(String value) {
            addCriterion("goodsunit >", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThanOrEqualTo(String value) {
            addCriterion("goodsunit >=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThan(String value) {
            addCriterion("goodsunit <", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThanOrEqualTo(String value) {
            addCriterion("goodsunit <=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLike(String value) {
            addCriterion("goodsunit like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotLike(String value) {
            addCriterion("goodsunit not like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIn(List<String> values) {
            addCriterion("goodsunit in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotIn(List<String> values) {
            addCriterion("goodsunit not in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitBetween(String value1, String value2) {
            addCriterion("goodsunit between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotBetween(String value1, String value2) {
            addCriterion("goodsunit not between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("goodsweight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("goodsweight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(BigDecimal value) {
            addCriterion("goodsweight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(BigDecimal value) {
            addCriterion("goodsweight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(BigDecimal value) {
            addCriterion("goodsweight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsweight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(BigDecimal value) {
            addCriterion("goodsweight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsweight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<BigDecimal> values) {
            addCriterion("goodsweight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<BigDecimal> values) {
            addCriterion("goodsweight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsweight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsweight not between", value1, value2, "goodsweight");
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

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceIsNull() {
            addCriterion("pregoodsprice is null");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceIsNotNull() {
            addCriterion("pregoodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceEqualTo(BigDecimal value) {
            addCriterion("pregoodsprice =", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceNotEqualTo(BigDecimal value) {
            addCriterion("pregoodsprice <>", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceGreaterThan(BigDecimal value) {
            addCriterion("pregoodsprice >", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pregoodsprice >=", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceLessThan(BigDecimal value) {
            addCriterion("pregoodsprice <", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pregoodsprice <=", value, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceIn(List<BigDecimal> values) {
            addCriterion("pregoodsprice in", values, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceNotIn(List<BigDecimal> values) {
            addCriterion("pregoodsprice not in", values, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pregoodsprice between", value1, value2, "pregoodsprice");
            return (Criteria) this;
        }

        public Criteria andPregoodspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pregoodsprice not between", value1, value2, "pregoodsprice");
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

        public Criteria andIsrefinementIsNull() {
            addCriterion("isrefinement is null");
            return (Criteria) this;
        }

        public Criteria andIsrefinementIsNotNull() {
            addCriterion("isrefinement is not null");
            return (Criteria) this;
        }

        public Criteria andIsrefinementEqualTo(String value) {
            addCriterion("isrefinement =", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementNotEqualTo(String value) {
            addCriterion("isrefinement <>", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementGreaterThan(String value) {
            addCriterion("isrefinement >", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementGreaterThanOrEqualTo(String value) {
            addCriterion("isrefinement >=", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementLessThan(String value) {
            addCriterion("isrefinement <", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementLessThanOrEqualTo(String value) {
            addCriterion("isrefinement <=", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementLike(String value) {
            addCriterion("isrefinement like", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementNotLike(String value) {
            addCriterion("isrefinement not like", value, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementIn(List<String> values) {
            addCriterion("isrefinement in", values, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementNotIn(List<String> values) {
            addCriterion("isrefinement not in", values, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementBetween(String value1, String value2) {
            addCriterion("isrefinement between", value1, value2, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIsrefinementNotBetween(String value1, String value2) {
            addCriterion("isrefinement not between", value1, value2, "isrefinement");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("ishot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("ishot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(String value) {
            addCriterion("ishot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(String value) {
            addCriterion("ishot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(String value) {
            addCriterion("ishot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(String value) {
            addCriterion("ishot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(String value) {
            addCriterion("ishot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(String value) {
            addCriterion("ishot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLike(String value) {
            addCriterion("ishot like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotLike(String value) {
            addCriterion("ishot not like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<String> values) {
            addCriterion("ishot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<String> values) {
            addCriterion("ishot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(String value1, String value2) {
            addCriterion("ishot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(String value1, String value2) {
            addCriterion("ishot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNull() {
            addCriterion("isdiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNotNull() {
            addCriterion("isdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountEqualTo(String value) {
            addCriterion("isdiscount =", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotEqualTo(String value) {
            addCriterion("isdiscount <>", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThan(String value) {
            addCriterion("isdiscount >", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThanOrEqualTo(String value) {
            addCriterion("isdiscount >=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThan(String value) {
            addCriterion("isdiscount <", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThanOrEqualTo(String value) {
            addCriterion("isdiscount <=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLike(String value) {
            addCriterion("isdiscount like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotLike(String value) {
            addCriterion("isdiscount not like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIn(List<String> values) {
            addCriterion("isdiscount in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotIn(List<String> values) {
            addCriterion("isdiscount not in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountBetween(String value1, String value2) {
            addCriterion("isdiscount between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotBetween(String value1, String value2) {
            addCriterion("isdiscount not between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIsNull() {
            addCriterion("updatatime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIsNotNull() {
            addCriterion("updatatime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeEqualTo(Date value) {
            addCriterionForJDBCDate("updatatime =", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatatime <>", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updatatime >", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatatime >=", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeLessThan(Date value) {
            addCriterionForJDBCDate("updatatime <", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatatime <=", value, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeIn(List<Date> values) {
            addCriterionForJDBCDate("updatatime in", values, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatatime not in", values, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatatime between", value1, value2, "updatatime");
            return (Criteria) this;
        }

        public Criteria andUpdatatimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatatime not between", value1, value2, "updatatime");
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