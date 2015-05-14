package me.alfredis.collectionsystem.datastructure;

import java.util.Calendar;

/**
 * Created by Alfred on 15/5/4.
 */
public class RigEvent {
    protected String classPeopleCount;        //班次/人数
    protected Calendar date;                  //日期
    protected String projectName;             //作业项目

    //时间
    protected Calendar startTime;             //开始时间
    protected Calendar endTime;               //结束时间


    //钻杆组成
    protected int drillPipeId;                //钻杆编号
    protected double drillPipeLength;         //钻杆长度
    protected double cumulativeLength;        //累计长度


    //岩芯管
    protected double coreBarreliDiameter;     //岩芯管直径
    protected double coreBarreliLength;       //岩芯管长度

    //钻头组成
    protected String drillType;               //钻头类型
    protected double drillDiameter;           //钻头直径
    protected double drillLength;             //钻头长度

    //贯入器组成
    protected String penetrationDiameter; //贯入器直径
    protected String penetrationLength; //贯入器长度

    //动探类型
    protected String DynamicSoundingType;
    //探头组成
    protected String SoundingDiameter; //探头直接
    protected String SoundingLength; //探头长度

    //进尺
    protected double drillToolTotalLength;    //钻具总长
    protected double drillToolRemainLength;   //钻杆余长
    protected double roundTripMeterage;       //回次进尺
    protected double cumulativeMeterage;      //累积进尺

    //岩芯采取
    protected String rockCoreId;                //岩芯编号
    protected double rockCoreLength;          //岩芯长度
    protected double rockCoreRecovery;        //岩芯采取旅

    //地层
    protected double startDepth;              //本钻起深度 TODO 计算深度差?
    protected double endDepth;                //本钻止深度
    protected String groundName;              //岩土名称
    protected String groundColor;             //岩土颜色
    protected String groundDensity;           //岩土臭密度
    protected String groundSaturation;       //岩土饱和度
    protected String groundWeathering;       //岩石风化程度

    protected String Note;                     //TODO 岩土岩性?特殊情况记录

    public enum DynamicSoundingType {
        //动探类型： 轻型，重型，超重型
        LIGHT, HEAVY, SUPERHEAVY
    }

    public enum ProjectNameType {
        //作业类型： 合钻，标贯，动探
        NormalRig, StandardPenetration, DynamicSounding
    }


    public RigEvent(String classPeopleCount, String projectName, int drillPipeId, double drillPipeLength, double cumulativeLength, double drillToolTotalLength, double drillToolRemainLength, double roundTripMeterage, double cumulativeMeterage, String note) {
        Calendar c = Calendar.getInstance();
        this.classPeopleCount = classPeopleCount;
        this.date = c;
        this.startTime = c;
        this.endTime = c;
        this.projectName = projectName;
        this.drillPipeId = drillPipeId;
        this.drillPipeLength = drillPipeLength;
        this.cumulativeLength = cumulativeLength;
        this.drillToolTotalLength = drillToolTotalLength;
        this.drillToolRemainLength = drillToolRemainLength;
        this.roundTripMeterage = roundTripMeterage;
        this.cumulativeMeterage = cumulativeMeterage;
        Note = note;
    }

    public String getClassPeopleCount() {
        return classPeopleCount;
    }

    public void setId(String classPeopleCount) {
        this.classPeopleCount = classPeopleCount;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public int getDrillPipeId() {
        return drillPipeId;
    }

    public void setDrillPipeId(int drillPipeId) {
        this.drillPipeId = drillPipeId;
    }

    public double getDrillPipeLength() {
        return drillPipeLength;
    }

    public void setDrillPipeLength(double drillPipeLength) {
        this.drillPipeLength = drillPipeLength;
    }

    public double getCumulativeLength() {
        return cumulativeLength;
    }

    public void setCumulativeLength(double cumulativeLength) {
        this.cumulativeLength = cumulativeLength;
    }

    public double getCoreBarreliDiameter() {
        return coreBarreliDiameter;
    }

    public void setCoreBarreliDiameter(double coreBarreliDiameter) {
        this.coreBarreliDiameter = coreBarreliDiameter;
    }

    public double getCoreBarreliLength() {
        return coreBarreliLength;
    }

    public void setCoreBarreliLength(double coreBarreliLength) {
        this.coreBarreliLength = coreBarreliLength;
    }

    public String getDrillType() {
        return drillType;
    }

    public void setDrillType(String drillType) {
        this.drillType = drillType;
    }

    public double getDrillDiameter() {
        return drillDiameter;
    }

    public void setDrillDiameter(double drillDiameter) {
        this.drillDiameter = drillDiameter;
    }

    public double getDrillLength() {
        return drillLength;
    }

    public void setDrillLength(double drillLength) {
        this.drillLength = drillLength;
    }

    public double getDrillToolTotalLength() {
        return drillToolTotalLength;
    }

    public void setDrillToolTotalLength(double drillToolTotalLength) {
        this.drillToolTotalLength = drillToolTotalLength;
    }

    public double getDrillToolRemainLength() {
        return drillToolRemainLength;
    }

    public void setDrillToolRemainLength(double drillToolRemainLength) {
        this.drillToolRemainLength = drillToolRemainLength;
    }

    public double getRoundTripMeterage() {
        return roundTripMeterage;
    }

    public void setRoundTripMeterage(double roundTripMeterage) {
        this.roundTripMeterage = roundTripMeterage;
    }

    public double getCumulativeMeterage() {
        return cumulativeMeterage;
    }

    public void setCumulativeMeterage(double cumulativeMeterage) {
        this.cumulativeMeterage = cumulativeMeterage;
    }

    public String getRockCoreId() {
        return rockCoreId;
    }

    public void setRockCoreId(String rockCoreId) {
        this.rockCoreId = rockCoreId;
    }

    public double getRockCoreLength() {
        return rockCoreLength;
    }

    public void setRockCoreLength(double rockCoreLength) {
        this.rockCoreLength = rockCoreLength;
    }

    public double getRockCoreRecovery() {
        return rockCoreRecovery;
    }

    public void setRockCoreRecovery(double rockCoreRecovery) {
        this.rockCoreRecovery = rockCoreRecovery;
    }

    public double getStartDepth() {
        return startDepth;
    }

    public void setStartDepth(double startDepth) {
        this.startDepth = startDepth;
    }

    public double getEndDepth() {
        return endDepth;
    }

    public void setEndDepth(double endDepth) {
        this.endDepth = endDepth;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public String getGroundColor() {
        return groundColor;
    }

    public void setGroundColor(String groundColor) {
        this.groundColor = groundColor;
    }

    public String getGroundDensity() {
        return groundDensity;
    }

    public void setGroundDensity(String groundDensity) {
        this.groundDensity = groundDensity;
    }

    public String getGroundSaturation() {
        return groundSaturation;
    }

    public void setGroundSaturation(String groundSaturation) {
        this.groundSaturation = groundSaturation;
    }

    public String getGroundWeathering() {
        return groundWeathering;
    }

    public void setGroundWeathering(String groundWeathering) {
        this.groundWeathering = groundWeathering;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        this.Note = note;
    }

    public String getPenetrationDiameter() {
        return penetrationDiameter;
    }

    public void setPenetrationDiameter(String penetrationDiameter) {
        this.penetrationDiameter = penetrationDiameter;
    }

    public String getPenetrationLength() {
        return penetrationLength;
    }

    public void setPenetrationLength(String penetrationLength) {
        this.penetrationLength = penetrationLength;
    }

    public String getDynamicSoundingType() {
        return DynamicSoundingType;
    }

    public void setDynamicSoundingType(String dynamicSoundingType) {
        DynamicSoundingType = dynamicSoundingType;
    }

    public String getSoundingDiameter() {
        return SoundingDiameter;
    }

    public void setSoundingDiameter(String soundingDiameter) {
        SoundingDiameter = soundingDiameter;
    }

    public String getSoundingLength() {
        return SoundingLength;
    }

    public void setSoundingLength(String soundingLength) {
        SoundingLength = soundingLength;
    }
}
