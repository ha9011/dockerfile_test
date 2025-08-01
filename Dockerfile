# Amazon Corretto 17 JDK 이미지 사용
FROM amazoncorretto:17

# 작업 디렉터리 생성 및 설정
WORKDIR /app

# 빌드된 jar 파일을 컨테이너 내 /app으로 복사
COPY build/libs/*.jar app.jar

# 컨테이너가 노출할 포트 설정 (스프링부트 기본 포트 8088)
EXPOSE 8088

# 컨테이너 시작 시 실행할 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]
