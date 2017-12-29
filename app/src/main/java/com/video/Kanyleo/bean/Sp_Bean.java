package com.video.Kanyleo.bean;

import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public class Sp_Bean {

    private int status_code;
    private ExtraBean extra;
    private List<DataBeanX> data;

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
        this.data = data;
    }

    public static class ExtraBean {
        private int total;
        private boolean has_more;
        private long max_time;
        private long min_time;
        private long now;
        private BannerBean banner;
        private List<?> fatal_ids;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
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

        public long getMin_time() {
            return min_time;
        }

        public void setMin_time(long min_time) {
            this.min_time = min_time;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public BannerBean getBanner() {
            return banner;
        }

        public void setBanner(BannerBean banner) {
            this.banner = banner;
        }

        public List<?> getFatal_ids() {
            return fatal_ids;
        }

        public void setFatal_ids(List<?> fatal_ids) {
            this.fatal_ids = fatal_ids;
        }

        public static class BannerBean {
            /**
             * banners : []
             * total : 0
             */

            private int total;
            private List<?> banners;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<?> getBanners() {
                return banners;
            }

            public void setBanners(List<?> banners) {
                this.banners = banners;
            }
        }
    }

    public static class DataBeanX {
        /**
         * type : 3
         * rid : 20171226145206010011041032735E9D
         * data : {"display_style":3,"weibo_share_title":"#玩视频上火山#哈尔滨，小丸子在火山上分享了视频，快来围观！传送门戳我>>https://reflow.huoshan.com/share/item/6498539177620016397/?tag=0","feed_tips":"1.0万","share_title":"东北嘎嘎冷的天，真心不容易","cell_width":18,"create_time":1513059066,"video":{"video_id":"28ee5ce5a2f94197972a2eeb2785fbb5","url_list":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"],"allow_cache":true,"cover":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/large/4c6900126c3902d042a6.webp"],"uri":"large/4c6900126c3902d042a6"},"uri":"28ee5ce5a2f94197972a2eeb2785fbb5","download_url":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"],"height":960,"width":540,"duration":14.769,"preload_size":512000,"quality_info":[{"bit_rate":1811412,"gear_name":"high","uri":"28ee5ce5a2f94197972a2eeb2785fbb5/high","urls":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]}],"cover_medium":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/medium/4c6900126c3902d042a6.webp"],"uri":"medium/4c6900126c3902d042a6"},"cover_thumb":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/live/100x100/4c6900126c3902d042a6.webp"],"uri":"live/100x100/4c6900126c3902d042a6"}},"id":6498539177620016397,"user_bury":0,"stats":{"play_count":7318438,"share_count":16810,"comment_count":10483,"digg_count":77163},"share_enable":true,"title":"东北嘎嘎冷的天，真心不容易","at_users":[],"share_url":"https://reflow.huoshan.com/share/item/6498539177620016397/?tag=0","cell_style":2,"id_str":"6498539177620016397","media_type":4,"tips":"火力: 2723","location":"哈尔滨","status":102,"cell_height":29,"description":"双击＋关注","song":{},"tips_url":"https://hotsoon.snssdk.com/hotsoon/in_app/pyramid_selling/?source=money","allow_comment":true,"user_digg":0,"feed_tips_type":1,"comment_delay":-1,"author":{"allow_find_by_contacts":true,"avatar_large":{"url_list":["http://p9.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp"],"uri":"1080x1080/39f400019b6d8a96bb2b"},"allow_sync_to_other_platform":true,"is_following":false,"allow_others_download_video":true,"is_follower":false,"hotsoon_verified_reason":"","allow_unfollower_comment":true,"constellation":"迷之星座","id":68725190222,"verified_mobile":false,"push_ichat":true,"city":"哈尔滨","verified":false,"short_id":204229288,"push_follow":true,"verified_reason":"","push_digg":true,"pay_grade":{"diamond_icon":{"url_list":["http://p3.pstatp.com/obj/12400003aba3dd42e213","http://pb9.pstatp.com/obj/12400003aba3dd42e213","http://pb3.pstatp.com/obj/12400003aba3dd42e213"],"uri":"12400003aba3dd42e213"},"this_grade_min_diamond":0,"total_diamond_count":0,"name":"暂无","level":0,"upgrade_need_consume":1,"live_icon":{"url_list":["http://p1.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b"],"uri":"2bd200048a6d1f88860b"},"next_diamond":1,"grade_describe":"当前无等级，消费1钻石即可升级获勋章","screen_chat_type":1,"grade_icon_list":[{"level_str":"暂无","icon_diamond":0,"icon":{"url_list":["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"],"uri":"3b60000a6308f74aec4e"},"level":0},{"level_str":"Lv.0","icon_diamond":0,"icon":{"url_list":["http://p3.pstatp.com/obj/3b65000678af61a99a1b","http://pb9.pstatp.com/obj/3b65000678af61a99a1b","http://pb3.pstatp.com/obj/3b65000678af61a99a1b"],"uri":"3b65000678af61a99a1b"},"level":0},{"level_str":"Lv.1","icon_diamond":1,"icon":{"url_list":["http://p1.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513"],"uri":"3b620006b1e388185513"},"level":1}],"now_diamond":0,"this_grade_max_diamond":0,"next_icon":{"url_list":["http://p1.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e"],"uri":"30eb0000a12588d9bb3e"},"icon":{"url_list":["http://p3.pstatp.com/obj/f2100085e55a62833b1","http://pb9.pstatp.com/obj/f2100085e55a62833b1","http://pb3.pstatp.com/obj/f2100085e55a62833b1"],"uri":"f2100085e55a62833b1"},"next_name":"树苗","pay_diamond_bak":0},"id_str":"68725190222","avatar_medium":{"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp"],"uri":"720x720/39f400019b6d8a96bb2b"},"fold_stranger_chat":false,"birthday_valid":false,"need_profile_guide":false,"hotsoon_verified":false,"birthday_description":"90后","birthday":0,"push_video_post":true,"push_video_recommend":true,"nickname":"哈尔滨，小丸子","avatar_thumb":{"url_list":["http://p9.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp"],"uri":"100x100/39f400019b6d8a96bb2b"},"disable_ichat":0,"fan_ticket_count":10815,"push_status":true,"avatar_jpg":{"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg"],"uri":"720x720/39f400019b6d8a96bb2b"},"allow_be_located":true,"level":1,"push_comment_status":true,"gender":0,"allow_show_in_gossip":true,"allow_strange_comment":true,"signature":"","follow_status":0},"allow_dislike":true,"share_description":"「哈尔滨，小丸子」的视频居然赚了 272.3元, 秘密在这里>>","allow_share":true}
         */

        private int type;
        private String rid;
        private DataBean data;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * display_style : 3
             * weibo_share_title : #玩视频上火山#哈尔滨，小丸子在火山上分享了视频，快来围观！传送门戳我>>https://reflow.huoshan.com/share/item/6498539177620016397/?tag=0
             * feed_tips : 1.0万
             * share_title : 东北嘎嘎冷的天，真心不容易
             * cell_width : 18
             * create_time : 1513059066
             * video : {"video_id":"28ee5ce5a2f94197972a2eeb2785fbb5","url_list":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"],"allow_cache":true,"cover":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/large/4c6900126c3902d042a6.webp"],"uri":"large/4c6900126c3902d042a6"},"uri":"28ee5ce5a2f94197972a2eeb2785fbb5","download_url":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"],"height":960,"width":540,"duration":14.769,"preload_size":512000,"quality_info":[{"bit_rate":1811412,"gear_name":"high","uri":"28ee5ce5a2f94197972a2eeb2785fbb5/high","urls":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]}],"cover_medium":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/medium/4c6900126c3902d042a6.webp"],"uri":"medium/4c6900126c3902d042a6"},"cover_thumb":{"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/live/100x100/4c6900126c3902d042a6.webp"],"uri":"live/100x100/4c6900126c3902d042a6"}}
             * id : 6498539177620016397
             * user_bury : 0
             * stats : {"play_count":7318438,"share_count":16810,"comment_count":10483,"digg_count":77163}
             * share_enable : true
             * title : 东北嘎嘎冷的天，真心不容易
             * at_users : []
             * share_url : https://reflow.huoshan.com/share/item/6498539177620016397/?tag=0
             * cell_style : 2
             * id_str : 6498539177620016397
             * media_type : 4
             * tips : 火力: 2723
             * location : 哈尔滨
             * status : 102
             * cell_height : 29
             * description : 双击＋关注
             * song : {}
             * tips_url : https://hotsoon.snssdk.com/hotsoon/in_app/pyramid_selling/?source=money
             * allow_comment : true
             * user_digg : 0
             * feed_tips_type : 1
             * comment_delay : -1
             * author : {"allow_find_by_contacts":true,"avatar_large":{"url_list":["http://p9.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp"],"uri":"1080x1080/39f400019b6d8a96bb2b"},"allow_sync_to_other_platform":true,"is_following":false,"allow_others_download_video":true,"is_follower":false,"hotsoon_verified_reason":"","allow_unfollower_comment":true,"constellation":"迷之星座","id":68725190222,"verified_mobile":false,"push_ichat":true,"city":"哈尔滨","verified":false,"short_id":204229288,"push_follow":true,"verified_reason":"","push_digg":true,"pay_grade":{"diamond_icon":{"url_list":["http://p3.pstatp.com/obj/12400003aba3dd42e213","http://pb9.pstatp.com/obj/12400003aba3dd42e213","http://pb3.pstatp.com/obj/12400003aba3dd42e213"],"uri":"12400003aba3dd42e213"},"this_grade_min_diamond":0,"total_diamond_count":0,"name":"暂无","level":0,"upgrade_need_consume":1,"live_icon":{"url_list":["http://p1.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b"],"uri":"2bd200048a6d1f88860b"},"next_diamond":1,"grade_describe":"当前无等级，消费1钻石即可升级获勋章","screen_chat_type":1,"grade_icon_list":[{"level_str":"暂无","icon_diamond":0,"icon":{"url_list":["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"],"uri":"3b60000a6308f74aec4e"},"level":0},{"level_str":"Lv.0","icon_diamond":0,"icon":{"url_list":["http://p3.pstatp.com/obj/3b65000678af61a99a1b","http://pb9.pstatp.com/obj/3b65000678af61a99a1b","http://pb3.pstatp.com/obj/3b65000678af61a99a1b"],"uri":"3b65000678af61a99a1b"},"level":0},{"level_str":"Lv.1","icon_diamond":1,"icon":{"url_list":["http://p1.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513"],"uri":"3b620006b1e388185513"},"level":1}],"now_diamond":0,"this_grade_max_diamond":0,"next_icon":{"url_list":["http://p1.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e"],"uri":"30eb0000a12588d9bb3e"},"icon":{"url_list":["http://p3.pstatp.com/obj/f2100085e55a62833b1","http://pb9.pstatp.com/obj/f2100085e55a62833b1","http://pb3.pstatp.com/obj/f2100085e55a62833b1"],"uri":"f2100085e55a62833b1"},"next_name":"树苗","pay_diamond_bak":0},"id_str":"68725190222","avatar_medium":{"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp"],"uri":"720x720/39f400019b6d8a96bb2b"},"fold_stranger_chat":false,"birthday_valid":false,"need_profile_guide":false,"hotsoon_verified":false,"birthday_description":"90后","birthday":0,"push_video_post":true,"push_video_recommend":true,"nickname":"哈尔滨，小丸子","avatar_thumb":{"url_list":["http://p9.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp"],"uri":"100x100/39f400019b6d8a96bb2b"},"disable_ichat":0,"fan_ticket_count":10815,"push_status":true,"avatar_jpg":{"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg"],"uri":"720x720/39f400019b6d8a96bb2b"},"allow_be_located":true,"level":1,"push_comment_status":true,"gender":0,"allow_show_in_gossip":true,"allow_strange_comment":true,"signature":"","follow_status":0}
             * allow_dislike : true
             * share_description : 「哈尔滨，小丸子」的视频居然赚了 272.3元, 秘密在这里>>
             * allow_share : true
             */

            private int display_style;
            private String weibo_share_title;
            private String feed_tips;
            private String share_title;
            private int cell_width;
            private int create_time;
            private VideoBean video;
            private long id;
            private int user_bury;
            private StatsBean stats;
            private boolean share_enable;
            private String title;
            private String share_url;
            private int cell_style;
            private String id_str;
            private int media_type;
            private String tips;
            private String location;
            private int status;
            private int cell_height;
            private String description;
            private SongBean song;
            private String tips_url;
            private boolean allow_comment;
            private int user_digg;
            private int feed_tips_type;
            private int comment_delay;
            private AuthorBean author;
            private boolean allow_dislike;
            private String share_description;
            private boolean allow_share;
            private List<?> at_users;

            public int getDisplay_style() {
                return display_style;
            }

            public void setDisplay_style(int display_style) {
                this.display_style = display_style;
            }

            public String getWeibo_share_title() {
                return weibo_share_title;
            }

            public void setWeibo_share_title(String weibo_share_title) {
                this.weibo_share_title = weibo_share_title;
            }

            public String getFeed_tips() {
                return feed_tips;
            }

            public void setFeed_tips(String feed_tips) {
                this.feed_tips = feed_tips;
            }

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public int getCell_width() {
                return cell_width;
            }

            public void setCell_width(int cell_width) {
                this.cell_width = cell_width;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public VideoBean getVideo() {
                return video;
            }

            public void setVideo(VideoBean video) {
                this.video = video;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public int getUser_bury() {
                return user_bury;
            }

            public void setUser_bury(int user_bury) {
                this.user_bury = user_bury;
            }

            public StatsBean getStats() {
                return stats;
            }

            public void setStats(StatsBean stats) {
                this.stats = stats;
            }

            public boolean isShare_enable() {
                return share_enable;
            }

            public void setShare_enable(boolean share_enable) {
                this.share_enable = share_enable;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public int getCell_style() {
                return cell_style;
            }

            public void setCell_style(int cell_style) {
                this.cell_style = cell_style;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public int getMedia_type() {
                return media_type;
            }

            public void setMedia_type(int media_type) {
                this.media_type = media_type;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCell_height() {
                return cell_height;
            }

            public void setCell_height(int cell_height) {
                this.cell_height = cell_height;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public SongBean getSong() {
                return song;
            }

            public void setSong(SongBean song) {
                this.song = song;
            }

            public String getTips_url() {
                return tips_url;
            }

            public void setTips_url(String tips_url) {
                this.tips_url = tips_url;
            }

            public boolean isAllow_comment() {
                return allow_comment;
            }

            public void setAllow_comment(boolean allow_comment) {
                this.allow_comment = allow_comment;
            }

            public int getUser_digg() {
                return user_digg;
            }

            public void setUser_digg(int user_digg) {
                this.user_digg = user_digg;
            }

            public int getFeed_tips_type() {
                return feed_tips_type;
            }

            public void setFeed_tips_type(int feed_tips_type) {
                this.feed_tips_type = feed_tips_type;
            }

            public int getComment_delay() {
                return comment_delay;
            }

            public void setComment_delay(int comment_delay) {
                this.comment_delay = comment_delay;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public boolean isAllow_dislike() {
                return allow_dislike;
            }

            public void setAllow_dislike(boolean allow_dislike) {
                this.allow_dislike = allow_dislike;
            }

            public String getShare_description() {
                return share_description;
            }

            public void setShare_description(String share_description) {
                this.share_description = share_description;
            }

            public boolean isAllow_share() {
                return allow_share;
            }

            public void setAllow_share(boolean allow_share) {
                this.allow_share = allow_share;
            }

            public List<?> getAt_users() {
                return at_users;
            }

            public void setAt_users(List<?> at_users) {
                this.at_users = at_users;
            }

            public static class VideoBean {
                /**
                 * video_id : 28ee5ce5a2f94197972a2eeb2785fbb5
                 * url_list : ["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]
                 * allow_cache : true
                 * cover : {"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/large/4c6900126c3902d042a6.webp"],"uri":"large/4c6900126c3902d042a6"}
                 * uri : 28ee5ce5a2f94197972a2eeb2785fbb5
                 * download_url : ["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]
                 * height : 960
                 * width : 540
                 * duration : 14.769
                 * preload_size : 512000
                 * quality_info : [{"bit_rate":1811412,"gear_name":"high","uri":"28ee5ce5a2f94197972a2eeb2785fbb5/high","urls":["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]}]
                 * cover_medium : {"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/medium/4c6900126c3902d042a6.webp"],"uri":"medium/4c6900126c3902d042a6"}
                 * cover_thumb : {"avg_color":"#7A6D53","url_list":["http://p9.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/live/100x100/4c6900126c3902d042a6.webp"],"uri":"live/100x100/4c6900126c3902d042a6"}
                 */

                private String video_id;
                private boolean allow_cache;
                private CoverBean cover;
                private String uri;
                private int height;
                private int width;
                private double duration;
                private int preload_size;
                private CoverMediumBean cover_medium;
                private CoverThumbBean cover_thumb;
                private List<String> url_list;
                private List<String> download_url;
                private List<QualityInfoBean> quality_info;

                public String getVideo_id() {
                    return video_id;
                }

                public void setVideo_id(String video_id) {
                    this.video_id = video_id;
                }

                public boolean isAllow_cache() {
                    return allow_cache;
                }

                public void setAllow_cache(boolean allow_cache) {
                    this.allow_cache = allow_cache;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public double getDuration() {
                    return duration;
                }

                public void setDuration(double duration) {
                    this.duration = duration;
                }

                public int getPreload_size() {
                    return preload_size;
                }

                public void setPreload_size(int preload_size) {
                    this.preload_size = preload_size;
                }

                public CoverMediumBean getCover_medium() {
                    return cover_medium;
                }

                public void setCover_medium(CoverMediumBean cover_medium) {
                    this.cover_medium = cover_medium;
                }

                public CoverThumbBean getCover_thumb() {
                    return cover_thumb;
                }

                public void setCover_thumb(CoverThumbBean cover_thumb) {
                    this.cover_thumb = cover_thumb;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }

                public List<String> getDownload_url() {
                    return download_url;
                }

                public void setDownload_url(List<String> download_url) {
                    this.download_url = download_url;
                }

                public List<QualityInfoBean> getQuality_info() {
                    return quality_info;
                }

                public void setQuality_info(List<QualityInfoBean> quality_info) {
                    this.quality_info = quality_info;
                }

                public static class CoverBean {
                    /**
                     * avg_color : #7A6D53
                     * url_list : ["http://p9.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/large/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/large/4c6900126c3902d042a6.webp"]
                     * uri : large/4c6900126c3902d042a6
                     */

                    private String avg_color;
                    private String uri;
                    private List<String> url_list;

                    public String getAvg_color() {
                        return avg_color;
                    }

                    public void setAvg_color(String avg_color) {
                        this.avg_color = avg_color;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class CoverMediumBean {
                    /**
                     * avg_color : #7A6D53
                     * url_list : ["http://p9.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/medium/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/medium/4c6900126c3902d042a6.webp"]
                     * uri : medium/4c6900126c3902d042a6
                     */

                    private String avg_color;
                    private String uri;
                    private List<String> url_list;

                    public String getAvg_color() {
                        return avg_color;
                    }

                    public void setAvg_color(String avg_color) {
                        this.avg_color = avg_color;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class CoverThumbBean {
                    /**
                     * avg_color : #7A6D53
                     * url_list : ["http://p9.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb1.pstatp.com/live/100x100/4c6900126c3902d042a6.webp","http://pb3.pstatp.com/live/100x100/4c6900126c3902d042a6.webp"]
                     * uri : live/100x100/4c6900126c3902d042a6
                     */

                    private String avg_color;
                    private String uri;
                    private List<String> url_list;

                    public String getAvg_color() {
                        return avg_color;
                    }

                    public void setAvg_color(String avg_color) {
                        this.avg_color = avg_color;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class QualityInfoBean {
                    /**
                     * bit_rate : 1811412
                     * gear_name : high
                     * uri : 28ee5ce5a2f94197972a2eeb2785fbb5/high
                     * urls : ["http://v11-hs.ixigua.com/8e20dc5aef57c416d96169868c9ab79f/5a41f197/video/m/2200a5e8fc0b5584b0893c6863a62d754c81152e70500003a3c587786ed/","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=0&app_id=1112&vquality=normal&quality=720p","https://api.huoshan.com/hotsoon/item/video/_playback/?video_id=28ee5ce5a2f94197972a2eeb2785fbb5&line=1&app_id=1112&vquality=normal&quality=720p"]
                     */

                    private int bit_rate;
                    private String gear_name;
                    private String uri;
                    private List<String> urls;

                    public int getBit_rate() {
                        return bit_rate;
                    }

                    public void setBit_rate(int bit_rate) {
                        this.bit_rate = bit_rate;
                    }

                    public String getGear_name() {
                        return gear_name;
                    }

                    public void setGear_name(String gear_name) {
                        this.gear_name = gear_name;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrls() {
                        return urls;
                    }

                    public void setUrls(List<String> urls) {
                        this.urls = urls;
                    }
                }
            }

            public static class StatsBean {
            }

            public static class SongBean {
            }

            public static class AuthorBean {
                /**
                 * allow_find_by_contacts : true
                 * avatar_large : {"url_list":["http://p9.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp"],"uri":"1080x1080/39f400019b6d8a96bb2b"}
                 * allow_sync_to_other_platform : true
                 * is_following : false
                 * allow_others_download_video : true
                 * is_follower : false
                 * hotsoon_verified_reason :
                 * allow_unfollower_comment : true
                 * constellation : 迷之星座
                 * id : 68725190222
                 * verified_mobile : false
                 * push_ichat : true
                 * city : 哈尔滨
                 * verified : false
                 * short_id : 204229288
                 * push_follow : true
                 * verified_reason :
                 * push_digg : true
                 * pay_grade : {"diamond_icon":{"url_list":["http://p3.pstatp.com/obj/12400003aba3dd42e213","http://pb9.pstatp.com/obj/12400003aba3dd42e213","http://pb3.pstatp.com/obj/12400003aba3dd42e213"],"uri":"12400003aba3dd42e213"},"this_grade_min_diamond":0,"total_diamond_count":0,"name":"暂无","level":0,"upgrade_need_consume":1,"live_icon":{"url_list":["http://p1.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b"],"uri":"2bd200048a6d1f88860b"},"next_diamond":1,"grade_describe":"当前无等级，消费1钻石即可升级获勋章","screen_chat_type":1,"grade_icon_list":[{"level_str":"暂无","icon_diamond":0,"icon":{"url_list":["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"],"uri":"3b60000a6308f74aec4e"},"level":0},{"level_str":"Lv.0","icon_diamond":0,"icon":{"url_list":["http://p3.pstatp.com/obj/3b65000678af61a99a1b","http://pb9.pstatp.com/obj/3b65000678af61a99a1b","http://pb3.pstatp.com/obj/3b65000678af61a99a1b"],"uri":"3b65000678af61a99a1b"},"level":0},{"level_str":"Lv.1","icon_diamond":1,"icon":{"url_list":["http://p1.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513"],"uri":"3b620006b1e388185513"},"level":1}],"now_diamond":0,"this_grade_max_diamond":0,"next_icon":{"url_list":["http://p1.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e"],"uri":"30eb0000a12588d9bb3e"},"icon":{"url_list":["http://p3.pstatp.com/obj/f2100085e55a62833b1","http://pb9.pstatp.com/obj/f2100085e55a62833b1","http://pb3.pstatp.com/obj/f2100085e55a62833b1"],"uri":"f2100085e55a62833b1"},"next_name":"树苗","pay_diamond_bak":0}
                 * id_str : 68725190222
                 * avatar_medium : {"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp"],"uri":"720x720/39f400019b6d8a96bb2b"}
                 * fold_stranger_chat : false
                 * birthday_valid : false
                 * need_profile_guide : false
                 * hotsoon_verified : false
                 * birthday_description : 90后
                 * birthday : 0
                 * push_video_post : true
                 * push_video_recommend : true
                 * nickname : 哈尔滨，小丸子
                 * avatar_thumb : {"url_list":["http://p9.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp"],"uri":"100x100/39f400019b6d8a96bb2b"}
                 * disable_ichat : 0
                 * fan_ticket_count : 10815
                 * push_status : true
                 * avatar_jpg : {"url_list":["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg"],"uri":"720x720/39f400019b6d8a96bb2b"}
                 * allow_be_located : true
                 * level : 1
                 * push_comment_status : true
                 * gender : 0
                 * allow_show_in_gossip : true
                 * allow_strange_comment : true
                 * signature :
                 * follow_status : 0
                 */

                private boolean allow_find_by_contacts;
                private AvatarLargeBean avatar_large;
                private boolean allow_sync_to_other_platform;
                private boolean is_following;
                private boolean allow_others_download_video;
                private boolean is_follower;
                private String hotsoon_verified_reason;
                private boolean allow_unfollower_comment;
                private String constellation;
                private long id;
                private boolean verified_mobile;
                private boolean push_ichat;
                private String city;
                private boolean verified;
                private int short_id;
                private boolean push_follow;
                private String verified_reason;
                private boolean push_digg;
                private PayGradeBean pay_grade;
                private String id_str;
                private AvatarMediumBean avatar_medium;
                private boolean fold_stranger_chat;
                private boolean birthday_valid;
                private boolean need_profile_guide;
                private boolean hotsoon_verified;
                private String birthday_description;
                private int birthday;
                private boolean push_video_post;
                private boolean push_video_recommend;
                private String nickname;
                private AvatarThumbBean avatar_thumb;
                private int disable_ichat;
                private int fan_ticket_count;
                private boolean push_status;
                private AvatarJpgBean avatar_jpg;
                private boolean allow_be_located;
                private int level;
                private boolean push_comment_status;
                private int gender;
                private boolean allow_show_in_gossip;
                private boolean allow_strange_comment;
                private String signature;
                private int follow_status;

                public boolean isAllow_find_by_contacts() {
                    return allow_find_by_contacts;
                }

                public void setAllow_find_by_contacts(boolean allow_find_by_contacts) {
                    this.allow_find_by_contacts = allow_find_by_contacts;
                }

                public AvatarLargeBean getAvatar_large() {
                    return avatar_large;
                }

                public void setAvatar_large(AvatarLargeBean avatar_large) {
                    this.avatar_large = avatar_large;
                }

                public boolean isAllow_sync_to_other_platform() {
                    return allow_sync_to_other_platform;
                }

                public void setAllow_sync_to_other_platform(boolean allow_sync_to_other_platform) {
                    this.allow_sync_to_other_platform = allow_sync_to_other_platform;
                }

                public boolean isIs_following() {
                    return is_following;
                }

                public void setIs_following(boolean is_following) {
                    this.is_following = is_following;
                }

                public boolean isAllow_others_download_video() {
                    return allow_others_download_video;
                }

                public void setAllow_others_download_video(boolean allow_others_download_video) {
                    this.allow_others_download_video = allow_others_download_video;
                }

                public boolean isIs_follower() {
                    return is_follower;
                }

                public void setIs_follower(boolean is_follower) {
                    this.is_follower = is_follower;
                }

                public String getHotsoon_verified_reason() {
                    return hotsoon_verified_reason;
                }

                public void setHotsoon_verified_reason(String hotsoon_verified_reason) {
                    this.hotsoon_verified_reason = hotsoon_verified_reason;
                }

                public boolean isAllow_unfollower_comment() {
                    return allow_unfollower_comment;
                }

                public void setAllow_unfollower_comment(boolean allow_unfollower_comment) {
                    this.allow_unfollower_comment = allow_unfollower_comment;
                }

                public String getConstellation() {
                    return constellation;
                }

                public void setConstellation(String constellation) {
                    this.constellation = constellation;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public boolean isVerified_mobile() {
                    return verified_mobile;
                }

                public void setVerified_mobile(boolean verified_mobile) {
                    this.verified_mobile = verified_mobile;
                }

                public boolean isPush_ichat() {
                    return push_ichat;
                }

                public void setPush_ichat(boolean push_ichat) {
                    this.push_ichat = push_ichat;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public boolean isVerified() {
                    return verified;
                }

                public void setVerified(boolean verified) {
                    this.verified = verified;
                }

                public int getShort_id() {
                    return short_id;
                }

                public void setShort_id(int short_id) {
                    this.short_id = short_id;
                }

                public boolean isPush_follow() {
                    return push_follow;
                }

                public void setPush_follow(boolean push_follow) {
                    this.push_follow = push_follow;
                }

                public String getVerified_reason() {
                    return verified_reason;
                }

                public void setVerified_reason(String verified_reason) {
                    this.verified_reason = verified_reason;
                }

                public boolean isPush_digg() {
                    return push_digg;
                }

                public void setPush_digg(boolean push_digg) {
                    this.push_digg = push_digg;
                }

                public PayGradeBean getPay_grade() {
                    return pay_grade;
                }

                public void setPay_grade(PayGradeBean pay_grade) {
                    this.pay_grade = pay_grade;
                }

                public String getId_str() {
                    return id_str;
                }

                public void setId_str(String id_str) {
                    this.id_str = id_str;
                }

                public AvatarMediumBean getAvatar_medium() {
                    return avatar_medium;
                }

                public void setAvatar_medium(AvatarMediumBean avatar_medium) {
                    this.avatar_medium = avatar_medium;
                }

                public boolean isFold_stranger_chat() {
                    return fold_stranger_chat;
                }

                public void setFold_stranger_chat(boolean fold_stranger_chat) {
                    this.fold_stranger_chat = fold_stranger_chat;
                }

                public boolean isBirthday_valid() {
                    return birthday_valid;
                }

                public void setBirthday_valid(boolean birthday_valid) {
                    this.birthday_valid = birthday_valid;
                }

                public boolean isNeed_profile_guide() {
                    return need_profile_guide;
                }

                public void setNeed_profile_guide(boolean need_profile_guide) {
                    this.need_profile_guide = need_profile_guide;
                }

                public boolean isHotsoon_verified() {
                    return hotsoon_verified;
                }

                public void setHotsoon_verified(boolean hotsoon_verified) {
                    this.hotsoon_verified = hotsoon_verified;
                }

                public String getBirthday_description() {
                    return birthday_description;
                }

                public void setBirthday_description(String birthday_description) {
                    this.birthday_description = birthday_description;
                }

                public int getBirthday() {
                    return birthday;
                }

                public void setBirthday(int birthday) {
                    this.birthday = birthday;
                }

                public boolean isPush_video_post() {
                    return push_video_post;
                }

                public void setPush_video_post(boolean push_video_post) {
                    this.push_video_post = push_video_post;
                }

                public boolean isPush_video_recommend() {
                    return push_video_recommend;
                }

                public void setPush_video_recommend(boolean push_video_recommend) {
                    this.push_video_recommend = push_video_recommend;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public AvatarThumbBean getAvatar_thumb() {
                    return avatar_thumb;
                }

                public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
                    this.avatar_thumb = avatar_thumb;
                }

                public int getDisable_ichat() {
                    return disable_ichat;
                }

                public void setDisable_ichat(int disable_ichat) {
                    this.disable_ichat = disable_ichat;
                }

                public int getFan_ticket_count() {
                    return fan_ticket_count;
                }

                public void setFan_ticket_count(int fan_ticket_count) {
                    this.fan_ticket_count = fan_ticket_count;
                }

                public boolean isPush_status() {
                    return push_status;
                }

                public void setPush_status(boolean push_status) {
                    this.push_status = push_status;
                }

                public AvatarJpgBean getAvatar_jpg() {
                    return avatar_jpg;
                }

                public void setAvatar_jpg(AvatarJpgBean avatar_jpg) {
                    this.avatar_jpg = avatar_jpg;
                }

                public boolean isAllow_be_located() {
                    return allow_be_located;
                }

                public void setAllow_be_located(boolean allow_be_located) {
                    this.allow_be_located = allow_be_located;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public boolean isPush_comment_status() {
                    return push_comment_status;
                }

                public void setPush_comment_status(boolean push_comment_status) {
                    this.push_comment_status = push_comment_status;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public boolean isAllow_show_in_gossip() {
                    return allow_show_in_gossip;
                }

                public void setAllow_show_in_gossip(boolean allow_show_in_gossip) {
                    this.allow_show_in_gossip = allow_show_in_gossip;
                }

                public boolean isAllow_strange_comment() {
                    return allow_strange_comment;
                }

                public void setAllow_strange_comment(boolean allow_strange_comment) {
                    this.allow_strange_comment = allow_strange_comment;
                }

                public String getSignature() {
                    return signature;
                }

                public void setSignature(String signature) {
                    this.signature = signature;
                }

                public int getFollow_status() {
                    return follow_status;
                }

                public void setFollow_status(int follow_status) {
                    this.follow_status = follow_status;
                }

                public static class AvatarLargeBean {
                    /**
                     * url_list : ["http://p9.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/1080x1080/39f400019b6d8a96bb2b.webp"]
                     * uri : 1080x1080/39f400019b6d8a96bb2b
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class PayGradeBean {
                    /**
                     * diamond_icon : {"url_list":["http://p3.pstatp.com/obj/12400003aba3dd42e213","http://pb9.pstatp.com/obj/12400003aba3dd42e213","http://pb3.pstatp.com/obj/12400003aba3dd42e213"],"uri":"12400003aba3dd42e213"}
                     * this_grade_min_diamond : 0
                     * total_diamond_count : 0
                     * name : 暂无
                     * level : 0
                     * upgrade_need_consume : 1
                     * live_icon : {"url_list":["http://p1.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b"],"uri":"2bd200048a6d1f88860b"}
                     * next_diamond : 1
                     * grade_describe : 当前无等级，消费1钻石即可升级获勋章
                     * screen_chat_type : 1
                     * grade_icon_list : [{"level_str":"暂无","icon_diamond":0,"icon":{"url_list":["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"],"uri":"3b60000a6308f74aec4e"},"level":0},{"level_str":"Lv.0","icon_diamond":0,"icon":{"url_list":["http://p3.pstatp.com/obj/3b65000678af61a99a1b","http://pb9.pstatp.com/obj/3b65000678af61a99a1b","http://pb3.pstatp.com/obj/3b65000678af61a99a1b"],"uri":"3b65000678af61a99a1b"},"level":0},{"level_str":"Lv.1","icon_diamond":1,"icon":{"url_list":["http://p1.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513","http://pb3.pstatp.com/obj/3b620006b1e388185513"],"uri":"3b620006b1e388185513"},"level":1}]
                     * now_diamond : 0
                     * this_grade_max_diamond : 0
                     * next_icon : {"url_list":["http://p1.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e"],"uri":"30eb0000a12588d9bb3e"}
                     * icon : {"url_list":["http://p3.pstatp.com/obj/f2100085e55a62833b1","http://pb9.pstatp.com/obj/f2100085e55a62833b1","http://pb3.pstatp.com/obj/f2100085e55a62833b1"],"uri":"f2100085e55a62833b1"}
                     * next_name : 树苗
                     * pay_diamond_bak : 0
                     */

                    private DiamondIconBean diamond_icon;
                    private int this_grade_min_diamond;
                    private int total_diamond_count;
                    private String name;
                    private int level;
                    private int upgrade_need_consume;
                    private LiveIconBean live_icon;
                    private int next_diamond;
                    private String grade_describe;
                    private int screen_chat_type;
                    private int now_diamond;
                    private int this_grade_max_diamond;
                    private NextIconBean next_icon;
                    private IconBean icon;
                    private String next_name;
                    private int pay_diamond_bak;
                    private List<GradeIconListBean> grade_icon_list;

                    public DiamondIconBean getDiamond_icon() {
                        return diamond_icon;
                    }

                    public void setDiamond_icon(DiamondIconBean diamond_icon) {
                        this.diamond_icon = diamond_icon;
                    }

                    public int getThis_grade_min_diamond() {
                        return this_grade_min_diamond;
                    }

                    public void setThis_grade_min_diamond(int this_grade_min_diamond) {
                        this.this_grade_min_diamond = this_grade_min_diamond;
                    }

                    public int getTotal_diamond_count() {
                        return total_diamond_count;
                    }

                    public void setTotal_diamond_count(int total_diamond_count) {
                        this.total_diamond_count = total_diamond_count;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public int getUpgrade_need_consume() {
                        return upgrade_need_consume;
                    }

                    public void setUpgrade_need_consume(int upgrade_need_consume) {
                        this.upgrade_need_consume = upgrade_need_consume;
                    }

                    public LiveIconBean getLive_icon() {
                        return live_icon;
                    }

                    public void setLive_icon(LiveIconBean live_icon) {
                        this.live_icon = live_icon;
                    }

                    public int getNext_diamond() {
                        return next_diamond;
                    }

                    public void setNext_diamond(int next_diamond) {
                        this.next_diamond = next_diamond;
                    }

                    public String getGrade_describe() {
                        return grade_describe;
                    }

                    public void setGrade_describe(String grade_describe) {
                        this.grade_describe = grade_describe;
                    }

                    public int getScreen_chat_type() {
                        return screen_chat_type;
                    }

                    public void setScreen_chat_type(int screen_chat_type) {
                        this.screen_chat_type = screen_chat_type;
                    }

                    public int getNow_diamond() {
                        return now_diamond;
                    }

                    public void setNow_diamond(int now_diamond) {
                        this.now_diamond = now_diamond;
                    }

                    public int getThis_grade_max_diamond() {
                        return this_grade_max_diamond;
                    }

                    public void setThis_grade_max_diamond(int this_grade_max_diamond) {
                        this.this_grade_max_diamond = this_grade_max_diamond;
                    }

                    public NextIconBean getNext_icon() {
                        return next_icon;
                    }

                    public void setNext_icon(NextIconBean next_icon) {
                        this.next_icon = next_icon;
                    }

                    public IconBean getIcon() {
                        return icon;
                    }

                    public void setIcon(IconBean icon) {
                        this.icon = icon;
                    }

                    public String getNext_name() {
                        return next_name;
                    }

                    public void setNext_name(String next_name) {
                        this.next_name = next_name;
                    }

                    public int getPay_diamond_bak() {
                        return pay_diamond_bak;
                    }

                    public void setPay_diamond_bak(int pay_diamond_bak) {
                        this.pay_diamond_bak = pay_diamond_bak;
                    }

                    public List<GradeIconListBean> getGrade_icon_list() {
                        return grade_icon_list;
                    }

                    public void setGrade_icon_list(List<GradeIconListBean> grade_icon_list) {
                        this.grade_icon_list = grade_icon_list;
                    }

                    public static class DiamondIconBean {
                        /**
                         * url_list : ["http://p3.pstatp.com/obj/12400003aba3dd42e213","http://pb9.pstatp.com/obj/12400003aba3dd42e213","http://pb3.pstatp.com/obj/12400003aba3dd42e213"]
                         * uri : 12400003aba3dd42e213
                         */

                        private String uri;
                        private List<String> url_list;

                        public String getUri() {
                            return uri;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public List<String> getUrl_list() {
                            return url_list;
                        }

                        public void setUrl_list(List<String> url_list) {
                            this.url_list = url_list;
                        }
                    }

                    public static class LiveIconBean {
                        /**
                         * url_list : ["http://p1.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b","http://pb3.pstatp.com/obj/2bd200048a6d1f88860b"]
                         * uri : 2bd200048a6d1f88860b
                         */

                        private String uri;
                        private List<String> url_list;

                        public String getUri() {
                            return uri;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public List<String> getUrl_list() {
                            return url_list;
                        }

                        public void setUrl_list(List<String> url_list) {
                            this.url_list = url_list;
                        }
                    }

                    public static class NextIconBean {
                        /**
                         * url_list : ["http://p1.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e","http://pb3.pstatp.com/obj/30eb0000a12588d9bb3e"]
                         * uri : 30eb0000a12588d9bb3e
                         */

                        private String uri;
                        private List<String> url_list;

                        public String getUri() {
                            return uri;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public List<String> getUrl_list() {
                            return url_list;
                        }

                        public void setUrl_list(List<String> url_list) {
                            this.url_list = url_list;
                        }
                    }

                    public static class IconBean {
                        /**
                         * url_list : ["http://p3.pstatp.com/obj/f2100085e55a62833b1","http://pb9.pstatp.com/obj/f2100085e55a62833b1","http://pb3.pstatp.com/obj/f2100085e55a62833b1"]
                         * uri : f2100085e55a62833b1
                         */

                        private String uri;
                        private List<String> url_list;

                        public String getUri() {
                            return uri;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public List<String> getUrl_list() {
                            return url_list;
                        }

                        public void setUrl_list(List<String> url_list) {
                            this.url_list = url_list;
                        }
                    }

                    public static class GradeIconListBean {
                        /**
                         * level_str : 暂无
                         * icon_diamond : 0
                         * icon : {"url_list":["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"],"uri":"3b60000a6308f74aec4e"}
                         * level : 0
                         */

                        private String level_str;
                        private int icon_diamond;
                        private IconBeanX icon;
                        private int level;

                        public String getLevel_str() {
                            return level_str;
                        }

                        public void setLevel_str(String level_str) {
                            this.level_str = level_str;
                        }

                        public int getIcon_diamond() {
                            return icon_diamond;
                        }

                        public void setIcon_diamond(int icon_diamond) {
                            this.icon_diamond = icon_diamond;
                        }

                        public IconBeanX getIcon() {
                            return icon;
                        }

                        public void setIcon(IconBeanX icon) {
                            this.icon = icon;
                        }

                        public int getLevel() {
                            return level;
                        }

                        public void setLevel(int level) {
                            this.level = level;
                        }

                        public static class IconBeanX {
                            /**
                             * url_list : ["http://p1.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e","http://pb3.pstatp.com/obj/3b60000a6308f74aec4e"]
                             * uri : 3b60000a6308f74aec4e
                             */

                            private String uri;
                            private List<String> url_list;

                            public String getUri() {
                                return uri;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
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

                public static class AvatarMediumBean {
                    /**
                     * url_list : ["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.webp"]
                     * uri : 720x720/39f400019b6d8a96bb2b
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class AvatarThumbBean {
                    /**
                     * url_list : ["http://p9.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb1.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp","http://pb3.pstatp.com/live/100x100/39f400019b6d8a96bb2b.webp"]
                     * uri : 100x100/39f400019b6d8a96bb2b
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class AvatarJpgBean {
                    /**
                     * url_list : ["http://p9.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb1.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg","http://pb3.pstatp.com/live/720x720/39f400019b6d8a96bb2b.jpg"]
                     * uri : 720x720/39f400019b6d8a96bb2b
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
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
    }
}
