package org.hmx.utils.storage.domain;

import java.io.Serializable;
import java.util.Date;

public class Division implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.oilreg_id
     *
     * @mbggenerated
     */
    private Long oilregId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.store_id
     *
     * @mbggenerated
     */
    private Long storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.oiltank_id
     *
     * @mbggenerated
     */
    private Long oiltankId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.oil_mass_litre
     *
     * @mbggenerated
     */
    private Float oilMassLitre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.oil_costtotal
     *
     * @mbggenerated
     */
    private Long oilCosttotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.total_amount
     *
     * @mbggenerated
     */
    private Long totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.total_count
     *
     * @mbggenerated
     */
    private Integer totalCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.total_litre
     *
     * @mbggenerated
     */
    private Float totalLitre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.div_amount
     *
     * @mbggenerated
     */
    private Long divAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.div_count
     *
     * @mbggenerated
     */
    private Integer divCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.div_litre
     *
     * @mbggenerated
     */
    private Float divLitre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.div_starttime
     *
     * @mbggenerated
     */
    private Date divStarttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.trigger1_payment_id
     *
     * @mbggenerated
     */
    private Long trigger1PaymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.trigger1_divamount
     *
     * @mbggenerated
     */
    private Long trigger1Divamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.div_endttime
     *
     * @mbggenerated
     */
    private Date divEndttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.trigger2_payment_id
     *
     * @mbggenerated
     */
    private Long trigger2PaymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.trigger2_divamount
     *
     * @mbggenerated
     */
    private Long trigger2Divamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.match_oiltype
     *
     * @mbggenerated
     */
    private Integer matchOiltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.oil_type_id
     *
     * @mbggenerated
     */
    private Long oilTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_division.rf_amount
     *
     * @mbggenerated
     */
    private Long rfAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_division
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.id
     *
     * @return the value of t_division.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.id
     *
     * @param id the value for t_division.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.oilreg_id
     *
     * @return the value of t_division.oilreg_id
     *
     * @mbggenerated
     */
    public Long getOilregId() {
        return oilregId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.oilreg_id
     *
     * @param oilregId the value for t_division.oilreg_id
     *
     * @mbggenerated
     */
    public void setOilregId(Long oilregId) {
        this.oilregId = oilregId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.store_id
     *
     * @return the value of t_division.store_id
     *
     * @mbggenerated
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.store_id
     *
     * @param storeId the value for t_division.store_id
     *
     * @mbggenerated
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.oiltank_id
     *
     * @return the value of t_division.oiltank_id
     *
     * @mbggenerated
     */
    public Long getOiltankId() {
        return oiltankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.oiltank_id
     *
     * @param oiltankId the value for t_division.oiltank_id
     *
     * @mbggenerated
     */
    public void setOiltankId(Long oiltankId) {
        this.oiltankId = oiltankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.oil_mass_litre
     *
     * @return the value of t_division.oil_mass_litre
     *
     * @mbggenerated
     */
    public Float getOilMassLitre() {
        return oilMassLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.oil_mass_litre
     *
     * @param oilMassLitre the value for t_division.oil_mass_litre
     *
     * @mbggenerated
     */
    public void setOilMassLitre(Float oilMassLitre) {
        this.oilMassLitre = oilMassLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.oil_costtotal
     *
     * @return the value of t_division.oil_costtotal
     *
     * @mbggenerated
     */
    public Long getOilCosttotal() {
        return oilCosttotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.oil_costtotal
     *
     * @param oilCosttotal the value for t_division.oil_costtotal
     *
     * @mbggenerated
     */
    public void setOilCosttotal(Long oilCosttotal) {
        this.oilCosttotal = oilCosttotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.total_amount
     *
     * @return the value of t_division.total_amount
     *
     * @mbggenerated
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.total_amount
     *
     * @param totalAmount the value for t_division.total_amount
     *
     * @mbggenerated
     */
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.total_count
     *
     * @return the value of t_division.total_count
     *
     * @mbggenerated
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.total_count
     *
     * @param totalCount the value for t_division.total_count
     *
     * @mbggenerated
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.total_litre
     *
     * @return the value of t_division.total_litre
     *
     * @mbggenerated
     */
    public Float getTotalLitre() {
        return totalLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.total_litre
     *
     * @param totalLitre the value for t_division.total_litre
     *
     * @mbggenerated
     */
    public void setTotalLitre(Float totalLitre) {
        this.totalLitre = totalLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.status
     *
     * @return the value of t_division.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.status
     *
     * @param status the value for t_division.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.div_amount
     *
     * @return the value of t_division.div_amount
     *
     * @mbggenerated
     */
    public Long getDivAmount() {
        return divAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.div_amount
     *
     * @param divAmount the value for t_division.div_amount
     *
     * @mbggenerated
     */
    public void setDivAmount(Long divAmount) {
        this.divAmount = divAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.div_count
     *
     * @return the value of t_division.div_count
     *
     * @mbggenerated
     */
    public Integer getDivCount() {
        return divCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.div_count
     *
     * @param divCount the value for t_division.div_count
     *
     * @mbggenerated
     */
    public void setDivCount(Integer divCount) {
        this.divCount = divCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.div_litre
     *
     * @return the value of t_division.div_litre
     *
     * @mbggenerated
     */
    public Float getDivLitre() {
        return divLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.div_litre
     *
     * @param divLitre the value for t_division.div_litre
     *
     * @mbggenerated
     */
    public void setDivLitre(Float divLitre) {
        this.divLitre = divLitre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.div_starttime
     *
     * @return the value of t_division.div_starttime
     *
     * @mbggenerated
     */
    public Date getDivStarttime() {
        return divStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.div_starttime
     *
     * @param divStarttime the value for t_division.div_starttime
     *
     * @mbggenerated
     */
    public void setDivStarttime(Date divStarttime) {
        this.divStarttime = divStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.trigger1_payment_id
     *
     * @return the value of t_division.trigger1_payment_id
     *
     * @mbggenerated
     */
    public Long getTrigger1PaymentId() {
        return trigger1PaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.trigger1_payment_id
     *
     * @param trigger1PaymentId the value for t_division.trigger1_payment_id
     *
     * @mbggenerated
     */
    public void setTrigger1PaymentId(Long trigger1PaymentId) {
        this.trigger1PaymentId = trigger1PaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.trigger1_divamount
     *
     * @return the value of t_division.trigger1_divamount
     *
     * @mbggenerated
     */
    public Long getTrigger1Divamount() {
        return trigger1Divamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.trigger1_divamount
     *
     * @param trigger1Divamount the value for t_division.trigger1_divamount
     *
     * @mbggenerated
     */
    public void setTrigger1Divamount(Long trigger1Divamount) {
        this.trigger1Divamount = trigger1Divamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.div_endttime
     *
     * @return the value of t_division.div_endttime
     *
     * @mbggenerated
     */
    public Date getDivEndttime() {
        return divEndttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.div_endttime
     *
     * @param divEndttime the value for t_division.div_endttime
     *
     * @mbggenerated
     */
    public void setDivEndttime(Date divEndttime) {
        this.divEndttime = divEndttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.trigger2_payment_id
     *
     * @return the value of t_division.trigger2_payment_id
     *
     * @mbggenerated
     */
    public Long getTrigger2PaymentId() {
        return trigger2PaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.trigger2_payment_id
     *
     * @param trigger2PaymentId the value for t_division.trigger2_payment_id
     *
     * @mbggenerated
     */
    public void setTrigger2PaymentId(Long trigger2PaymentId) {
        this.trigger2PaymentId = trigger2PaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.trigger2_divamount
     *
     * @return the value of t_division.trigger2_divamount
     *
     * @mbggenerated
     */
    public Long getTrigger2Divamount() {
        return trigger2Divamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.trigger2_divamount
     *
     * @param trigger2Divamount the value for t_division.trigger2_divamount
     *
     * @mbggenerated
     */
    public void setTrigger2Divamount(Long trigger2Divamount) {
        this.trigger2Divamount = trigger2Divamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.match_oiltype
     *
     * @return the value of t_division.match_oiltype
     *
     * @mbggenerated
     */
    public Integer getMatchOiltype() {
        return matchOiltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.match_oiltype
     *
     * @param matchOiltype the value for t_division.match_oiltype
     *
     * @mbggenerated
     */
    public void setMatchOiltype(Integer matchOiltype) {
        this.matchOiltype = matchOiltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.oil_type_id
     *
     * @return the value of t_division.oil_type_id
     *
     * @mbggenerated
     */
    public Long getOilTypeId() {
        return oilTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.oil_type_id
     *
     * @param oilTypeId the value for t_division.oil_type_id
     *
     * @mbggenerated
     */
    public void setOilTypeId(Long oilTypeId) {
        this.oilTypeId = oilTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_division.rf_amount
     *
     * @return the value of t_division.rf_amount
     *
     * @mbggenerated
     */
    public Long getRfAmount() {
        return rfAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_division.rf_amount
     *
     * @param rfAmount the value for t_division.rf_amount
     *
     * @mbggenerated
     */
    public void setRfAmount(Long rfAmount) {
        this.rfAmount = rfAmount;
    }
}