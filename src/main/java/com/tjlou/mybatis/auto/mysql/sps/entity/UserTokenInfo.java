package com.tjlou.mybatis.auto.mysql.sps.entity;

            import com.baomidou.mybatisplus.enums.IdType;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.annotations.TableField;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.enums.IdType;
        import com.baomidou.mybatisplus.annotations.TableName;
        import java.io.Serializable;
    
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 * <p>
 * 用户登录token信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-21
 */
@TableName("user_token_info")
public class UserTokenInfo implements Serializable,IEntity{


                /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
        private Long id;
            /**
     * 所属用户
     */
                @TableField("user_account_id")
    private Long userAccountId;
            /**
     * 移动端token
     */
            private String token;
            /**
     * 网页token
     */
                @TableField("h5_token")
    private String h5Token;
            /**
     * 小程序token
     */
                @TableField("mp_token")
    private String mpToken;
            /**
     * 公众号token
     */
                @TableField("web_token")
    private String webToken;
            /**
     * 工具token
     */
                @TableField("tool_token")
    private String toolToken;
            /**
     * 嵌套token
     */
                @TableField("nested_token")
    private String nestedToken;
            /**
     * 系统类型  1-超级仓库 2-锤定 4-诸葛拍拍
     */
                @TableField("system_type")
    private Integer systemType;

        
public Long getId(){
        return id;
        }

        public UserTokenInfo setId(Long id){
                this.id = id;
                return this;
            }
        
public Long getUserAccountId(){
        return userAccountId;
        }

        public UserTokenInfo setUserAccountId(Long userAccountId){
                this.userAccountId = userAccountId;
                return this;
            }
        
public String getToken(){
        return token;
        }

        public UserTokenInfo setToken(String token){
                    if(token != null)
        token = token.trim();
            this.token = token;
                return this;
            }
        
public String getH5Token(){
        return h5Token;
        }

        public UserTokenInfo setH5Token(String h5Token){
                    if(h5Token != null)
        h5Token = h5Token.trim();
            this.h5Token = h5Token;
                return this;
            }
        
public String getMpToken(){
        return mpToken;
        }

        public UserTokenInfo setMpToken(String mpToken){
                    if(mpToken != null)
        mpToken = mpToken.trim();
            this.mpToken = mpToken;
                return this;
            }
        
public String getWebToken(){
        return webToken;
        }

        public UserTokenInfo setWebToken(String webToken){
                    if(webToken != null)
        webToken = webToken.trim();
            this.webToken = webToken;
                return this;
            }
        
public String getToolToken(){
        return toolToken;
        }

        public UserTokenInfo setToolToken(String toolToken){
                    if(toolToken != null)
        toolToken = toolToken.trim();
            this.toolToken = toolToken;
                return this;
            }
        
public String getNestedToken(){
        return nestedToken;
        }

        public UserTokenInfo setNestedToken(String nestedToken){
                    if(nestedToken != null)
        nestedToken = nestedToken.trim();
            this.nestedToken = nestedToken;
                return this;
            }
        
public Integer getSystemType(){
        return systemType;
        }

        public UserTokenInfo setSystemType(Integer systemType){
                this.systemType = systemType;
                return this;
            }

/**
 * 表名
 */
public static final String TABLE_NAME="user_token_info" ;
                    /**
         * 主键
         */
            public static final String ID ="id" ;

                    /**
         * 所属用户
         */
            public static final String USER_ACCOUNT_ID ="user_account_id" ;

                    /**
         * 移动端token
         */
            public static final String TOKEN ="token" ;

                    /**
         * 网页token
         */
            public static final String H5_TOKEN ="h5_token" ;

                    /**
         * 小程序token
         */
            public static final String MP_TOKEN ="mp_token" ;

                    /**
         * 公众号token
         */
            public static final String WEB_TOKEN ="web_token" ;

                    /**
         * 工具token
         */
            public static final String TOOL_TOKEN ="tool_token" ;

                    /**
         * 嵌套token
         */
            public static final String NESTED_TOKEN ="nested_token" ;

                    /**
         * 系统类型  1-超级仓库 2-锤定 4-诸葛拍拍
         */
            public static final String SYSTEM_TYPE ="system_type" ;

    
@Override
public UserTokenInfo pkVal(Serializable val){
                this.id = Long.valueOf(val.toString());
            return this;
        }
        }

