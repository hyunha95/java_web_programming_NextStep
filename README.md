# java_web_programming_NextStep

리팩토링   
- 메소드가 한 가지 책임만 가지도록 구현한다.
- 인덴트(indent, 들여쓰기) 깊이를 1단계로 유지한다. 인덴트는 while문과 if문을 사용할 경우 인덴트 깊이가 1씩 증가한다. 예를 들어 다음 소스코드의 인데트는 깊이는 2이다.
```java
void someMethod() {
  while(true) {
    if(true) {
    
    }
  }
}
```
- else를 사용하지 마라. 프로그래밍을 구현할 때 else를 사용하지 않고 프로그래밍하는 것이 가능하다.
