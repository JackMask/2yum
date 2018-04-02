package com.guxingdongli.yizhangguan.model;

/**
 * @author 余先德
 * @data 2018/3/19
 */

public class HospitalFillInRepairOrderNewBase {

    /**
     * success : true
     * tipCode : 0
     * msg : 操作成功！
     * other :
     * data : {"applyId":293,"applyGuid":"1b4e2aec-dc6d-42dc-91e6-9c7f62949728","id":170,"gid":"78074306-3783-4f77-80d0-5895e26fc695","businessNumber":"WX20180319154807","name":"生物疫苗冷藏箱","hospitalGUID":"a170a487-2439-4657-b107-9ae203851eb1","hospitalName":"重庆市第十三人民医院","departmentID":5,"departmentName":"急诊科","repairTime":"2018-03-19 15:48:36","processTime":"2018-03-19 16:26:34","maintenanceStartDate":"2018-03-19 16:26:34","maintenancePhone":"18382046629","maintenanceContacts":"曾荣"}
     */

    private boolean success;
    private String tipCode;
    private String msg;
    private String other;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTipCode() {
        return tipCode;
    }

    public void setTipCode(String tipCode) {
        this.tipCode = tipCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * applyId : 293
         * applyGuid : 1b4e2aec-dc6d-42dc-91e6-9c7f62949728
         * id : 170
         * gid : 78074306-3783-4f77-80d0-5895e26fc695
         * businessNumber : WX20180319154807
         * name : 生物疫苗冷藏箱
         * hospitalGUID : a170a487-2439-4657-b107-9ae203851eb1
         * hospitalName : 重庆市第十三人民医院
         * departmentID : 5
         * departmentName : 急诊科
         * repairTime : 2018-03-19 15:48:36
         * processTime : 2018-03-19 16:26:34
         * maintenanceStartDate : 2018-03-19 16:26:34
         * maintenancePhone : 18382046629
         * maintenanceContacts : 曾荣
         */

        private int applyId;
        private String applyGuid;
        private int id;
        private String gid;
        private String businessNumber;
        private String name;
        private String hospitalGUID;
        private String hospitalName;
        private int departmentID;
        private String departmentName;
        private String repairTime;
        private String processTime;
        private String maintenanceStartDate;
        private String maintenancePhone;
        private String maintenanceContacts;

        public int getApplyId() {
            return applyId;
        }

        public void setApplyId(int applyId) {
            this.applyId = applyId;
        }

        public String getApplyGuid() {
            return applyGuid;
        }

        public void setApplyGuid(String applyGuid) {
            this.applyGuid = applyGuid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getBusinessNumber() {
            return businessNumber;
        }

        public void setBusinessNumber(String businessNumber) {
            this.businessNumber = businessNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHospitalGUID() {
            return hospitalGUID;
        }

        public void setHospitalGUID(String hospitalGUID) {
            this.hospitalGUID = hospitalGUID;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        public int getDepartmentID() {
            return departmentID;
        }

        public void setDepartmentID(int departmentID) {
            this.departmentID = departmentID;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getRepairTime() {
            return repairTime;
        }

        public void setRepairTime(String repairTime) {
            this.repairTime = repairTime;
        }

        public String getProcessTime() {
            return processTime;
        }

        public void setProcessTime(String processTime) {
            this.processTime = processTime;
        }

        public String getMaintenanceStartDate() {
            return maintenanceStartDate;
        }

        public void setMaintenanceStartDate(String maintenanceStartDate) {
            this.maintenanceStartDate = maintenanceStartDate;
        }

        public String getMaintenancePhone() {
            return maintenancePhone;
        }

        public void setMaintenancePhone(String maintenancePhone) {
            this.maintenancePhone = maintenancePhone;
        }

        public String getMaintenanceContacts() {
            return maintenanceContacts;
        }

        public void setMaintenanceContacts(String maintenanceContacts) {
            this.maintenanceContacts = maintenanceContacts;
        }
    }
}