//https://www.youtube.com/watch?v=WQ4aA4-MESE

<br>
<br>

<h1>
StringBuffer
</h1>

<h4>

```java
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
// o/p = 16

StringBuffer sb = new StringBuffer("Navin");
System.out.println(sb.capacity());
// o/p = 16+5 = 21 (it always gives 16 space extra)
System.out.println(sb.length()); 
// o/p = 5

sb.append("Reddi");
System.out.println(sb);
// o/p = Navin Raddi

//sb.#####() -->many method
```
</h4>