package com.video.Kanyleo.bean;

/**
 * Created by lenovo on 2017/10/22.
 */

public class ZhuCeBean {

    /**
     * code : 200
     * datas : {"key":"73a81c0e69077db676ea9599509caeef","userid":"41","username":"13439044472"}
     */

    private int code;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * key : 73a81c0e69077db676ea9599509caeef
         * userid : 41
         * username : 13439044472
         */

        private String key;
        private String userid;
        private String username;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
