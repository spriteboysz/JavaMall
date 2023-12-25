create database dnmall;

use dnmall;

DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    `user_id`          int auto_increment NOT NULL COMMENT '主键id;用户id',
    `user_name`        varchar(255)       NOT NULL COMMENT '用户名;用户名',
    `user_password`    varchar(64)        NOT NULL COMMENT '密码;密码',
    `user_nick_name`   varchar(255) COMMENT '昵称;昵称',
    `user_real_name`   varchar(90) COMMENT '真实姓名;真实姓名',
    `user_image`       varchar(1024)      NOT NULL COMMENT '头像;头像',
    `user_mobile`      varchar(255) COMMENT '手机号;手机号',
    `user_email`       varchar(255) COMMENT '邮箱地址;邮箱地址',
    `user_sex`         varchar(1) COMMENT '性别;M(男) or F(女)',
    `user_birth`       date COMMENT '生日;生日',
    `user_create_time` datetime           NOT NULL COMMENT '注册时间;创建时间',
    `user_update_time` datetime           NOT NULL COMMENT '更新时间;更新时间',
    PRIMARY KEY (user_id)
) COMMENT = '用户';


CREATE UNIQUE INDEX username ON user (user_name);

DROP TABLE IF EXISTS user_address;
CREATE TABLE user_address
(
    `addr_id`              int auto_increment not null COMMENT '地址主键id',
    `user_id`              int                NOT NULL COMMENT '用户ID',
    `addr_receiver_name`   varchar(255)       NOT NULL COMMENT '收件人姓名',
    `addr_receiver_mobile` varchar(255)       NOT NULL COMMENT '收件人手机号',
    `addr_province`        varchar(255)       NOT NULL COMMENT '省份',
    `addr_city`            varchar(255)       NOT NULL COMMENT '城市',
    `addr_area`            varchar(255)       NOT NULL COMMENT '区县',
    `addr_detail`          varchar(90)        NOT NULL COMMENT '详细地址',
    `addr_post_code`       varchar(255) COMMENT '邮编',
    `addr_status`          INT COMMENT '状态,1正常，0无效',
    `addr_default`         INT COMMENT '是否默认地址 1是;1:是  0:否',
    `addr_create_time`     datetime           NOT NULL COMMENT '创建时间',
    `addr_update_time`     datetime           NOT NULL COMMENT '更新时间',
    PRIMARY KEY (addr_id)
) COMMENT = '用户地址';

DROP TABLE IF EXISTS user_login;
CREATE TABLE user_login
(
    `login_id`      INT          NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `login_area`    varchar(255) COMMENT '地区',
    `login_country` varchar(255) COMMENT '国家',
    `user_id`       int COMMENT '用户id',
    `login_ip`      varchar(255) NOT NULL COMMENT 'IP',
    `login_time`    varchar(255) NOT NULL COMMENT '时间',
    PRIMARY KEY (login_id)
) COMMENT = '登录历史表';

DROP TABLE IF EXISTS rotation_chart;
CREATE TABLE rotation_chart
(
    `chart_id`          int         not null auto_increment COMMENT '主键',
    `chart_url`         varchar(90) NOT NULL COMMENT '图片;图片地址',
    `chart_color`       varchar(255) COMMENT '背景色;背景颜色',
    `product_id`        int COMMENT '商品id;商品id',
    `category_id`       int COMMENT '商品分类id;商品分类id',
    `chart_type`        INT         NOT NULL COMMENT '轮播图类型;轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类',
    `chart_seq`         INT         NOT NULL COMMENT '轮播图展示顺序;轮播图展示顺序，从小到大',
    `chart_status`      INT         NOT NULL COMMENT '是否展示:1表示正常显示，0表示下线;是否展示，1：展示    0：不展示',
    `chart_create_time` datetime    NOT NULL COMMENT '创建时间;创建时间',
    `chart_update_time` datetime    NOT NULL COMMENT '更新时间;更新',
    PRIMARY KEY (chart_id)
) COMMENT = '轮播图';

DROP TABLE IF EXISTS category;
CREATE TABLE category
(
    `category_id`        INT          NOT NULL AUTO_INCREMENT COMMENT '主键;分类id主键',
    `category_name`      varchar(255) NOT NULL COMMENT '分类名称;分类名称',
    `category_level`     INT          NOT NULL COMMENT '分类层级;分类得类型，1:一级大分类2:二级分类3:三级小分类',
    `category_parent_id` INT          NOT NULL COMMENT '父层级id;父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级',
    `category_icon`      varchar(64) COMMENT '图标;logo',
    `category_slogan`    varchar(64) COMMENT '口号',
    `category_image`     varchar(64) COMMENT '分类图',
    `category_color`     varchar(255) COMMENT '背景颜色',
    PRIMARY KEY (category_id)
) COMMENT = '商品分类';

DROP TABLE IF EXISTS product;
CREATE TABLE product
(
    `product_id`          int auto_increment not null COMMENT '商品主键id',
    `product_name`        varchar(32)        NOT NULL COMMENT '商品名称;商品名称',
    `category_id`         INT                NOT NULL COMMENT '分类外键id;分类id',
    `product_category_id` INT                NOT NULL COMMENT '一级分类外键id;一级分类id，用于优化查询',
    `product_sold_num`    INT                NOT NULL COMMENT '销量;累计销售',
    `product_status`      INT                NOT NULL COMMENT '默认是1，表示正常状态, -1表示删除, 0下架;默认是1，表示正常状态, -1表示删除, 0下架',
    `product_content`     text               NOT NULL COMMENT '商品内容;商品内容',
    `product_create_time` datetime           NOT NULL COMMENT '创建时间',
    `product_update_time` datetime           NOT NULL COMMENT '更新时间',
    PRIMARY KEY (product_id)
) COMMENT = '商品;商品信息相关表：分类表，商品图片表，商品规格表，商品参数表';

DROP TABLE IF EXISTS product_image;
CREATE TABLE product_image
(
    `image_id`           int auto_increment NOT NULL COMMENT '图片主键',
    `product_id`         int                NOT NULL COMMENT '商品外键id;商品外键id',
    `image_url`          varchar(90)        NOT NULL COMMENT '图片地址;图片地址',
    `image_sort`         INT                NOT NULL COMMENT '顺序;图片顺序，从小到大',
    `image_main`         INT                NOT NULL COMMENT '是否主图;是否主图，1：是，0：否',
    `image_created_time` datetime           NOT NULL COMMENT '创建时间',
    `image_updated_time` datetime           NOT NULL COMMENT '更新时间',
    PRIMARY KEY (image_id)
) COMMENT = '商品图片';

DROP TABLE IF EXISTS product_sku;
CREATE TABLE product_sku
(
    `sku_id`             int auto_increment NOT NULL COMMENT 'sku编号',
    `product_id`         int                NOT NULL COMMENT '商品id',
    `sku_name`           varchar(255)       NOT NULL COMMENT 'sku名称',
    `sku_image`          varchar(255) COMMENT 'sku图片',
    `sku_untitled`       varchar(255) COMMENT '属性组合（格式是p1:v1;p2:v2）',
    `sku_original_price` INT                NOT NULL COMMENT '原价',
    `sku_sell_price`     INT                NOT NULL COMMENT '销售价格',
    `sku_discounts`      decimal(4, 2)      NOT NULL COMMENT '折扣力度',
    `sku_stock`          INT                NOT NULL COMMENT '库存',
    `sku_create_time`    datetime           NOT NULL COMMENT '创建时间',
    `sku_update_time`    datetime           NOT NULL COMMENT '更新时间',
    `sku_status`         INT COMMENT 'sku状态(1启用，0禁用，-1删除)',
    PRIMARY KEY (sku_id)
) COMMENT = '商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计';

DROP TABLE IF EXISTS product_param;
CREATE TABLE product_param
(
    `param_id`            int auto_increment NOT NULL COMMENT '商品参数id',
    `product_id`          int                NOT NULL COMMENT '商品id',
    `param_place`         varchar(255)       NOT NULL COMMENT '产地;产地，例：中国江苏',
    `param_period`        varchar(255)       NOT NULL COMMENT '保质期;保质期，例：180天',
    `param_brand`         varchar(255)       NOT NULL COMMENT '品牌名;品牌名，例：三只大灰狼',
    `param_factory`       varchar(255)       NOT NULL COMMENT '生产厂名;生产厂名，例：大灰狼工厂',
    `param_address`       varchar(255)       NOT NULL COMMENT '生产厂址;生产厂址，例：大灰狼生产基地',
    `param_packaging`     varchar(255)       NOT NULL COMMENT '包装方式;包装方式，例：袋装',
    `param_weight`        varchar(255)       NOT NULL COMMENT '规格重量;规格重量，例：35g',
    `param_storage`       varchar(255)       NOT NULL COMMENT '存储方法;存储方法，例：常温5~25°',
    `param_eating_method` varchar(255)       NOT NULL COMMENT '食用方式;食用方式，例：开袋即食',
    `param_create_time`   datetime           NOT NULL COMMENT '创建时间',
    `param_update_time`   datetime           NOT NULL COMMENT '更新时间',
    PRIMARY KEY (param_id)
) COMMENT = '商品参数';

DROP TABLE IF EXISTS shopping_cart;
CREATE TABLE shopping_cart
(
    `cart_id`    INT          NOT NULL AUTO_INCREMENT COMMENT '主键',
    `product_id` int          NOT NULL COMMENT '商品ID',
    `sku_id`     int          NOT NULL COMMENT 'skuID',
    `user_id`    int          NOT NULL COMMENT '用户ID',
    `cart_num`   varchar(255) NOT NULL COMMENT '购物车商品数量',
    `cart_time`  varchar(255) NOT NULL COMMENT '添加购物车时间',
    `cart_price` decimal(24, 6) COMMENT '添加购物车时商品价格',
    `sku_props` varchar(255) NULL DEFAULT NULL COMMENT '选择的套餐的属性',
    PRIMARY KEY (cart_id)
) COMMENT = '购物车';

DROP TABLE IF EXISTS orders;
CREATE TABLE orders
(
    `order_id`               int auto_increment NOT NULL COMMENT '订单ID;同时也是订单编号',
    `user_id`                int                NOT NULL COMMENT '用户ID',
    `order_products`         varchar(255) COMMENT '产品名称（多个产品用,隔开）',
    `order_receiver_name`    varchar(255)       NOT NULL COMMENT '收货人快照',
    `order_receiver_mobile`  varchar(255)       NOT NULL COMMENT '收货人手机号快照',
    `order_receiver_address` varchar(90)        NOT NULL COMMENT '收货地址快照',
    `order_total_amount`     decimal(24, 6) COMMENT '订单总价格',
    `order_actual_amount`    INT                NOT NULL COMMENT '实际支付总价格',
    `order_pay_type`         INT                NOT NULL COMMENT '支付方式;1:微信 2:支付宝',
    `order_remark`           varchar(255) COMMENT '订单备注',
    `order_status`           varchar(255) COMMENT '订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭',
    `order_delivery_type`    varchar(255) COMMENT '配送方式',
    `order_delivery_id`      varchar(255) COMMENT '物流单号',
    `order_freight`          decimal(24, 6)     NOT NULL DEFAULT 0 COMMENT '订单运费;默认可以为零，代表包邮',
    `order_delete_status`    INT                NOT NULL DEFAULT 0 COMMENT '逻辑删除状态;1: 删除 0:未删除',
    `order_create_time`      datetime           NOT NULL COMMENT '创建时间（成交时间）',
    `order_update_time`      datetime           NOT NULL COMMENT '更新时间',
    `order_pay_time`         datetime COMMENT '付款时间',
    `order_delivery_time`    datetime COMMENT '发货时间',
    `order_finish_time`      datetime COMMENT '完成时间',
    `order_cancel_time`      datetime COMMENT '取消时间',
    `order_close_type`       INT COMMENT '订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易',
    PRIMARY KEY (order_id)
) COMMENT = '订单';

DROP TABLE IF EXISTS order_snapshot;
CREATE TABLE order_snapshot
(
    `snapshot_id`           int auto_increment NOT NULL COMMENT '订单项ID',
    `order_id`              int                NOT NULL COMMENT '订单ID',
    `product_id`            int                NOT NULL COMMENT '商品ID',
    `product_name`          varchar(255)       NOT NULL COMMENT '商品名称',
    `snapshot_image`        varchar(255) COMMENT '商品图片',
    `sku_id`                int                NOT NULL COMMENT 'skuID',
    `sku_name`              varchar(255)       NOT NULL COMMENT 'sku名称',
    `snapshot_price`        decimal(24, 6)     NOT NULL COMMENT '商品价格',
    `snapshot_buy_counts`   INT                NOT NULL COMMENT '购买数量',
    `snapshot_total_amount` decimal(24, 6) COMMENT '商品总金额',
    `snapshot_basket_date`  datetime COMMENT '加入购物车时间',
    `snapshot_buy_time`     datetime COMMENT '购买时间',
    `snapshot_comment`      INT COMMENT '评论状态： 0 未评价  1 已评价',
    PRIMARY KEY (snapshot_id)
) COMMENT = '订单项/快照';

DROP TABLE IF EXISTS product_comment;
CREATE TABLE product_comment
(
    `comment_id`            int auto_increment NOT NULL COMMENT 'ID',
    `product_id`            int                NOT NULL COMMENT '商品id',
    `product_name`          varchar(64) COMMENT '商品名称',
    `snapshot_id`           int COMMENT '订单项(商品快照)ID;可为空',
    `user_id`               int COMMENT '评论用户id;用户名须脱敏',
    `comment_anonymous`     INT COMMENT '是否匿名（1:是，0:否）',
    `comment_type`          INT COMMENT '评价类型（1好评，0中评，-1差评）',
    `comment_level`         INT                NOT NULL COMMENT '评价等级;1：好评 2：中评 3：差评',
    `comment_content`       varchar(128)       NOT NULL COMMENT '评价内容',
    `comment_image`         varchar(255) COMMENT '评价晒图(JSON {img1:url1,img2:url2})',
    `comment_time`          datetime COMMENT '评价时间;可为空',
    `comment_reply_status`  INT COMMENT '是否回复（0:未回复，1:已回复）',
    `comment_reply_content` varchar(255) COMMENT '回复内容',
    `comment_reply_time`    datetime COMMENT '回复时间',
    `comment_show`          INT COMMENT '是否显示（1:是，0:否）',
    PRIMARY KEY (comment_id)
) COMMENT = '商品评价';

