[uy.klutter.elasticsearch](../index.md) / [XContentJsonObjectWithEnum](.)


# XContentJsonObjectWithEnum

`class XContentJsonObjectWithEnum&lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt;&nbsp;:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md)` [(source)](https://github.com/kohesive/klutter/blob/master/elasticsearch-jdk7/src/main/kotlin/uy/klutter/elasticsearch/XContent.kt#L8)



### Constructors


| [&lt;init&gt;](-init-.md) | `XContentJsonObjectWithEnum(x:&nbsp;XContentBuilder)` |


### Inherited Properties


| [x](../-x-content-json-object/x.md) | `val x: XContentBuilder` |


### Functions


| [Array](-array.md) | `fun Array(field:&nbsp;T, init:&nbsp;[XContentJsonArray](../-x-content-json-array/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [Object](-object.md) | `fun Object(field:&nbsp;T, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [ObjectWithFieldClass](-object-with-field-class.md) | `fun &lt;R&nbsp;:&nbsp;Any&gt; ObjectWithFieldClass(field:&nbsp;T, init:&nbsp;[XContentJsonObjectWithClass](../-x-content-json-object-with-class/index.md)&lt;R&gt;.()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [ObjectWithFieldEnum](-object-with-field-enum.md) | `fun &lt;R&nbsp;:&nbsp;Enum&lt;R&gt;&gt; ObjectWithFieldEnum(field:&nbsp;T, init:&nbsp;XContentJsonObjectWithEnum&lt;R&gt;.()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [setValue](set-value.md) | `fun setValue(field:&nbsp;T, value:&nbsp;String): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Long): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Int): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Short): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Byte): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Double): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Float): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;[BigDecimal](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)): Unit`
`fun setValue(field:&nbsp;T, value:&nbsp;Boolean): Unit` |
| [setValueNull](set-value-null.md) | `fun setValueNull(field:&nbsp;T): Unit` |


### Inherited Functions


| [Array](../-x-content-json-object/-array.md) | `fun Array(name:&nbsp;String, init:&nbsp;[XContentJsonArray](../-x-content-json-array/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [Object](../-x-content-json-object/-object.md) | `fun Object(name:&nbsp;String, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [ObjectWithFieldClass](../-x-content-json-object/-object-with-field-class.md) | `fun &lt;R&nbsp;:&nbsp;Any&gt; ObjectWithFieldClass(name:&nbsp;String, init:&nbsp;[XContentJsonObjectWithClass](../-x-content-json-object-with-class/index.md)&lt;R&gt;.()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [ObjectWithFieldEnum](../-x-content-json-object/-object-with-field-enum.md) | `fun &lt;R&nbsp;:&nbsp;Enum&lt;R&gt;&gt; ObjectWithFieldEnum(name:&nbsp;String, init:&nbsp;XContentJsonObjectWithEnum&lt;R&gt;.()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [setValue](../-x-content-json-object/set-value.md) | `fun setValue(name:&nbsp;String, value:&nbsp;String): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Long): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Int): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Short): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Byte): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Double): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Float): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;[BigDecimal](http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)): Unit`
`fun setValue(name:&nbsp;String, value:&nbsp;Boolean): Unit` |
| [setValueNull](../-x-content-json-object/set-value-null.md) | `fun setValueNull(name:&nbsp;String): Unit` |


### Extension Functions


| [booleanField](../boolean-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~booleanField~~(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [booleanFieldMapping](../boolean-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.booleanFieldMapping(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).booleanFieldMapping(field:&nbsp;String, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [dateField](../date-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~dateField~~(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [dateFieldMapping](../date-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.dateFieldMapping(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).dateFieldMapping(field:&nbsp;String, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [ignoreField](../ignore-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~ignoreField~~(field:&nbsp;T): Unit` |
| [ignoreFieldMapping](../ignore-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.ignoreFieldMapping(field:&nbsp;T): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).ignoreFieldMapping(field:&nbsp;String): Unit` |
| [integerField](../integer-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~integerField~~(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [integerFieldMapping](../integer-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.integerFieldMapping(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).integerFieldMapping(field:&nbsp;String, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [longField](../long-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~longField~~(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [longFieldMapping](../long-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.longFieldMapping(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).longFieldMapping(field:&nbsp;String, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit): Unit` |
| [stringField](../string-field.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.~~stringField~~(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
| [stringFieldMapping](../string-field-mapping.md) | `fun &lt;T&nbsp;:&nbsp;Enum&lt;T&gt;&gt; XContentJsonObjectWithEnum&lt;T&gt;.stringFieldMapping(field:&nbsp;T, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit`
`fun [XContentJsonObject](../-x-content-json-object/index.md).stringFieldMapping(field:&nbsp;String, indexed:&nbsp;[EsIndexedField](../-es-indexed-field/index.md)&nbsp;=&nbsp;EsIndexedField.NOT_ANALYZED, stored:&nbsp;[EsStoredField](../-es-stored-field/index.md)&nbsp;=&nbsp;EsStoredField.NOT_STORED, init:&nbsp;[XContentJsonObject](../-x-content-json-object/index.md).()&nbsp;-&gt;&nbsp;Unit&nbsp;=&nbsp;{}): Unit` |
