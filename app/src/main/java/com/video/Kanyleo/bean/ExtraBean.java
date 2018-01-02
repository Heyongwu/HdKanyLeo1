package com.video.Kanyleo.bean;

import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */




    public  class ExtraBean {
        /**
         * banner : {"banners":[{"avg_color":"#A37C96","height":280,"id":995,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/activity/video/general/58/?source=hszb&dl=k2Jv","tab_types":[8],"title":"秀出你的free style","uri":"50f700051c9191b15e0c","url_list":["http://p1.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c"],"width":750},{"avg_color":"#524937","height":280,"id":673,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/week_star_rank/","tab_types":[1,2,8],"title":"礼物周星榜","uri":"3b1f00050526a4d6845a","url_list":["http://p9.pstatp.com/obj/3b1f00050526a4d6845a","http://pb1.pstatp.com/obj/3b1f00050526a4d6845a","http://pb3.pstatp.com/obj/3b1f00050526a4d6845a"],"width":750},{"avg_color":"#CCA3A3","height":280,"id":146,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/rank/rich_anchor/?hide_nav_bar=1","tab_types":[8],"title":"直播排行榜（常驻火山）","uri":"477b000175a7f1979ba2","url_list":["http://p3.pstatp.com/obj/477b000175a7f1979ba2","http://pb9.pstatp.com/obj/477b000175a7f1979ba2","http://pb3.pstatp.com/obj/477b000175a7f1979ba2"],"width":750},{"avg_color":"#BCBCE0","height":280,"id":468,"schema_url":"https://www.huoshan.com/promotion/landing_img/default/?img=fengmian2_f10ea567acc2e5a701f679ba14300202&format=jpg","tab_types":[1,2,8],"title":"直播封面标准","uri":"2bd2000f2e611afa3828","url_list":["http://p3.pstatp.com/obj/2bd2000f2e611afa3828","http://pb9.pstatp.com/obj/2bd2000f2e611afa3828","http://pb3.pstatp.com/obj/2bd2000f2e611afa3828"],"width":750},{"avg_color":"#CCA3A3","height":280,"id":452,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/greenlive/union_hall/","tab_types":[8],"title":"绿色主播联盟","uri":"2eaa0000729306a3bb51","url_list":["http://p3.pstatp.com/obj/2eaa0000729306a3bb51","http://pb9.pstatp.com/obj/2eaa0000729306a3bb51","http://pb3.pstatp.com/obj/2eaa0000729306a3bb51"],"width":750}],"total":5}
         * fatal_ids : []
         * has_more : true
         * max_time : 1514895726776
         * min_time : 0
         * now : 1514895726778
         * total : 12
         */

        private BannerBean banner;
        private boolean has_more;
        private long max_time;
        private int min_time;
        private long now;
        private int total;

        public BannerBean getBanner() {
            return banner;
        }

        public void setBanner(BannerBean banner) {
            this.banner = banner;
        }

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public long getMax_time() {
            return max_time;
        }

        public void setMax_time(long max_time) {
            this.max_time = max_time;
        }

        public int getMin_time() {
            return min_time;
        }

        public void setMin_time(int min_time) {
            this.min_time = min_time;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public static class BannerBean {
            /**
             * banners : [{"avg_color":"#A37C96","height":280,"id":995,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/activity/video/general/58/?source=hszb&dl=k2Jv","tab_types":[8],"title":"秀出你的free style","uri":"50f700051c9191b15e0c","url_list":["http://p1.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c"],"width":750},{"avg_color":"#524937","height":280,"id":673,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/week_star_rank/","tab_types":[1,2,8],"title":"礼物周星榜","uri":"3b1f00050526a4d6845a","url_list":["http://p9.pstatp.com/obj/3b1f00050526a4d6845a","http://pb1.pstatp.com/obj/3b1f00050526a4d6845a","http://pb3.pstatp.com/obj/3b1f00050526a4d6845a"],"width":750},{"avg_color":"#CCA3A3","height":280,"id":146,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/rank/rich_anchor/?hide_nav_bar=1","tab_types":[8],"title":"直播排行榜（常驻火山）","uri":"477b000175a7f1979ba2","url_list":["http://p3.pstatp.com/obj/477b000175a7f1979ba2","http://pb9.pstatp.com/obj/477b000175a7f1979ba2","http://pb3.pstatp.com/obj/477b000175a7f1979ba2"],"width":750},{"avg_color":"#BCBCE0","height":280,"id":468,"schema_url":"https://www.huoshan.com/promotion/landing_img/default/?img=fengmian2_f10ea567acc2e5a701f679ba14300202&format=jpg","tab_types":[1,2,8],"title":"直播封面标准","uri":"2bd2000f2e611afa3828","url_list":["http://p3.pstatp.com/obj/2bd2000f2e611afa3828","http://pb9.pstatp.com/obj/2bd2000f2e611afa3828","http://pb3.pstatp.com/obj/2bd2000f2e611afa3828"],"width":750},{"avg_color":"#CCA3A3","height":280,"id":452,"schema_url":"https://hotsoon.snssdk.com/hotsoon/in_app/greenlive/union_hall/","tab_types":[8],"title":"绿色主播联盟","uri":"2eaa0000729306a3bb51","url_list":["http://p3.pstatp.com/obj/2eaa0000729306a3bb51","http://pb9.pstatp.com/obj/2eaa0000729306a3bb51","http://pb3.pstatp.com/obj/2eaa0000729306a3bb51"],"width":750}]
             * total : 5
             */

            private int total;
            private java.util.List<BannersBean> banners;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<BannersBean> getBanners() {
                return banners;
            }

            public void setBanners(List<BannersBean> banners) {
                this.banners = banners;
            }

            public static class BannersBean {
                /**
                 * avg_color : #A37C96
                 * height : 280
                 * id : 995
                 * schema_url : https://hotsoon.snssdk.com/hotsoon/in_app/activity/video/general/58/?source=hszb&dl=k2Jv
                 * tab_types : [8]
                 * title : 秀出你的free style
                 * uri : 50f700051c9191b15e0c
                 * url_list : ["http://p1.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c","http://pb3.pstatp.com/obj/50f700051c9191b15e0c"]
                 * width : 750
                 */

                private String avg_color;
                private int height;
                private int id;
                private String schema_url;
                private String title;
                private String uri;
                private int width;
                private java.util.List<Integer> tab_types;
                private java.util.List<String> url_list;

                public String getAvg_color() {
                    return avg_color;
                }

                public void setAvg_color(String avg_color) {
                    this.avg_color = avg_color;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getSchema_url() {
                    return schema_url;
                }

                public void setSchema_url(String schema_url) {
                    this.schema_url = schema_url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<Integer> getTab_types() {
                    return tab_types;
                }

                public void setTab_types(List<Integer> tab_types) {
                    this.tab_types = tab_types;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }
    }

