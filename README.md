
# Project - Star Entertainment

## ๊ตฌ์ฑ :

<aside>
๐ ํ๋ก์ ํธ ๊ตฌ์ฑ ์ฌํญ 

MVC, JPA, Security, Jasper , Spring-Security-Taglibs, Jstl   

์ธ๋ถ API 
๊ฒฐ์  API, OAuth 2.0, chart API, etc api..  

build package : gradle 

etc : 
ERD, Git, Validation, Bootstrap, JQuery, Ajax , CSRF,
Coding convention, Responsive Web 

tools : 
STS suite , trello, notion , Git Readme, PPT

</aside>

## ํ์๋ผ์ธ :

[https://trello.com/b/o3e9VVuB/starent](https://trello.com/b/o3e9VVuB/starent)

## ๊น :

[https://github.com/1000bang/starEnt](https://github.com/1000bang/starEnt)

## ๋ธ์ :

https://1000bang.notion.site/Project-373eb1c07a074cff9e69d2c44bae356d


## ์ํฐํฐ

- UserEntity
    - id
    - username
    - userid
    - password
    - birth
    - email
    - status
    - role        
    - membership
    - addressEntity address

- addressEntity
    - id
    - postcode
    - address
    - detailAddress

- membershipEntity
    - tier
    - rate
    
- newsEntity
    - id
    - title
    - content 

- boardEntity 
    - id
    - title
    - content 
    - list<reply>
    - userid ์์ฑ์
    - starid  ์ด๋ค ์คํ์๊ฒ ์ฐ๋์ง (์์ด๋)
    
- replyEntity
    - id
    - content
    - createTime
    - user
    - board

- starEntity
    - id
    - birth
    - name
    - activity
    - role
        - ๊ทธ๋ฃน
        - ์๋ก
    - music
    - act
    - entertainer

- MusicEntity
    - id
    - starid
    - albumName
    - albumYear
    - albumPic

- MovieEntity
    - id
    - starid
    - movieName
    - movieYear
    - moviePic

- entertainmentEntity
    - id
    - starid
    - programName
    - programYear
    - programPic
    

---


## ๊ธฐ๋ฅ

### -  ์ ์  ๊ธฐ๋ฅ

๋ก๊ทธ์ธ & ๋ก๊ทธ์์ / ํ์๊ฐ์  / ๊ตฟ์ฆ์ต ๊ฒฐ์ / ํธ์ง์ฐ๊ธฐ(CRUD) / ์ค๋์ ์ ์ฒญ 

### -  ๊ด๋ฆฌ์ ๊ธฐ๋ฅ

์คํ ๊ด๋ฆฌ(์ถ๊ฐ ์์  ์ญ์  ๋ชฉ๋ก) / ๋ด์ค๊ด๋ฆฌ / ์ค๋์ ๊ณต์ง  / ๊ตฟ์ฆ์ต ๊ด๋ฆฌ (CRUD) 

### -  ์คํ ๊ธฐ๋ฅ

๋๊ธ ์ฐ๊ธฐ(ํฌ์ํต) ์ด์ธ์ ์ ์ ์ ๊ฐ์
