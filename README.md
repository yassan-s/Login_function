# Login Function
Spring bootによるログイン機能の実装
<br>
<br>

## 参照
ドキュメント<br>
https://spring.pleiades.io/guides/gs/securing-web/
<br>
<br>

### 参考にさせていただいた記事
***
- https://qiita.com/yosuke_takeuchi/items/93f9155b5a4fa1976247
- https://qiita.com/curry__30/items/276ba2b9236066683ba4
- https://qiita.com/a-pompom/items/80b3f4bb6414e8678829
- https://itmaroblog.com/webapplication-java-spring_8/
- https://solo-ware.com/programming/java/springboot-login-func/
***
<br>

## プロジェクト
- DevTools
- Security
- Session
- H2 Database
- JDBC API
- Thymeleaf
- web
<br>
<br>


## アノテーション
```
@Configuration
```
JavaConfig用の設定ファイルとして認識
<br>
<br>

```
@EnableWebSecurity
```
Spring-Securityを有効化する
<br>
<br>

```
@Autowired
```
Spring がコンテナの中からその「プロパティの型に合うクラス」のインスタンスを裏で new してくれる (DI)
<br>
<br>
