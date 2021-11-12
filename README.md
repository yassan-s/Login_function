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

## Cookie Session について

□ 前提<br>
HTTPが「Stateless(ステートレス)」なので、サーバーがクライアントの情報を保持し続けられない。<br>
したがってサーバー側がアクセスしてきたクライアントが同一人物かわからない。<br>

□ Session<br>
このような一連の流れをSessionと言う。<br>
- サイトにログイン
- サイト内で処理をする（ECサイトで買い物カゴに入れる など）
- ログアウトする

□ Cookie<br>
ECサイトなどにアクセスした時に以下の流れが起こる。
- サーバーは、「Session ID」を生成して、ユーザーと紐付けた上でサーバーに保存
- ショッピングサイトの画面を返すと同時に、このSession IDをブラウザに渡す
- 送られてきたSession IDを、送ってきたサーバーの情報等を含めた上で、「Cookie」に保存
<br>

つまり、CookieによりSession IDをもとにクライアントを識別することができる。

### 参考にさせていただいた記事
***
- https://www.engilaboo.com/definitely-understand-cookie-session/
- https://b1san-blog.com/post/web/web-cookie/
- https://qiita.com/opengl-8080/items/7c34053c74448d39e8f5
- https://b1san-blog.com/post/spring/spring-session/
- https://github.com/motaharinia/springboot-securityrememberme
- https://atmarkit.itmedia.co.jp/ait/articles/1704/20/news024_2.html
***
