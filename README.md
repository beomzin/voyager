# Voyager 🚀

> Java · JSP/Spring · JavaScript · Node.js · Vue 를 공부하며 작성한 예제 코드를 모아둔 **학습용 저장소**입니다.

각 디렉터리는 서로 독립된 프로젝트이며, 배운 순서와 주제별로 나뉘어 있습니다.

## 📁 디렉터리 구성

| 디렉터리 | 분야 | 주요 내용 |
| --- | --- | --- |
| [`java/`](java) | Java 기초 | 변수·자료형, 조건/반복문, 배열, 메서드, 클래스·상속·추상클래스·인터페이스, 싱글톤, Ctrl/Svc/Bean 계층 분리 연습 |
| [`web/`](web) | HTML · CSS · JS · JSP | HTML 태그/레이아웃, 이력서·회원가입 페이지 클론, 바닐라 JS(계산기, 숫자야구, JSON 다루기), JSP·JSTL |
| [`spring/`](spring) | Spring MVC | Spring 3.1 + Maven 기반 웹 프로젝트, `@RequestMapping` 컨트롤러, 서비스 계층, JSP 뷰(구구단 등) |
| [`express/`](express) | Node.js 기초 | JS 문법 예제(`syntax/`), `http`·`fs` 모듈만으로 만든 파일 기반 CRUD 웹앱 |
| [`node.js-mysql/`](node.js-mysql) | Node.js + MySQL | 위 웹앱을 MySQL(`topic`, `author` 테이블) 기반으로 확장 |
| [`vue/`](vue) | Vue CLI | `hello-vue`(데이터 바인딩, `v-if`/`v-for`, computed, 이벤트), `vue-practice`(라우터, axios), `sample_db`(Express + MySQL API 서버) |
| [`vite/`](vite) | Vue 3 + Vite | 주제별 미니 프로젝트(아래 표 참고), SQLite 기반 API 서버(`database`) |

### `vite/` 세부 프로젝트

| 프로젝트 | 학습 주제 |
| --- | --- |
| `vite-project` | Vite + Vue 3 기본 템플릿 |
| `component` / `custom_button` | 컴포넌트 작성과 재사용 |
| `props` | props, non-prop 속성 |
| `emits` | 자식 → 부모 이벤트 전달 |
| `slots` | 슬롯 |
| `provide-inject` | provide / inject |
| `computed` / `watch` | 계산된 속성, 감시자 |
| `inputs` | 폼 입력 바인딩(`v-model`) |
| `custom-directive` | 커스텀 디렉티브 |
| `mixins` | 믹스인 |
| `tables` | 테이블 컴포넌트 |
| `todo` | Todo 앱 (Composition API, localStorage, Bootstrap) |
| `triplek` | 프로필 페이지 (Vuex, axios, Bootstrap) — `database` 서버와 연동 |
| `database` | Express + SQLite3 API 서버 (`/db/about-me`) |

## 🛠 기술 스택

- **Language**: Java, JavaScript, HTML/CSS
- **Backend**: JSP, Spring MVC 3.1, Node.js, Express
- **Frontend**: Vue 3 (Vue CLI, Vite), Vuex, Vue Router, Bootstrap, jQuery
- **Database**: MySQL, SQLite
- **Tools**: Eclipse / STS, VS Code, Maven, npm

## ▶️ 실행 방법

### Java (`java/`)
Eclipse에서 `File > Import > Existing Projects into Workspace` 로 불러오거나, 터미널에서 직접 컴파일합니다.
```bash
cd java
javac -d bin -sourcepath src src/Test01.java
java -cp bin Test01
```

### JSP / Spring (`web/`, `spring/`)
Eclipse(STS)에 프로젝트를 import 한 뒤 Tomcat 서버에 올려 실행합니다. `spring/` 은 Maven 프로젝트입니다.

### Node.js (`express/`, `node.js-mysql/`)
```bash
cd express        # 또는 node.js-mysql
npm install
node main.js      # http://localhost:3000
```
`node.js-mysql/` 은 로컬 MySQL의 `opentutorials` 데이터베이스가 필요합니다. (접속 정보: `lib/db.js`)

### Vue (`vue/*`, `vite/*`)
```bash
cd vite/todo      # 원하는 프로젝트로 이동
npm install
npm run dev       # vue/hello-vue 는 npm run dev, vue/vue-practice 는 npm run serve
```
API 서버(`vite/database`, `vue/sample_db`)는 `node index.js` 로 실행합니다.
- `vite/database` : 포트 `8000`, SQLite 파일(`database.db`) 자동 생성
- `vue/sample_db` : 로컬 MySQL `employees` 데이터베이스 필요 (접속 정보: `database.json`)

> ⚠️ 저장소에 포함된 DB 접속 정보(`test` / `test1234` 등)는 **로컬 학습용 더미 값**입니다. 실제 서비스에서는 `.env` 등으로 분리해야 합니다.

## 📝 참고

- 학습 과정에서 작성한 코드라 정리되지 않은 부분이나 중복된 예제가 있을 수 있습니다.
- 빌드 산출물(`bin/`, `target/`, `node_modules/`, `dist/`)은 저장소에 포함하지 않습니다.
