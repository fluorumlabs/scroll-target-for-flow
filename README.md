[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/scroll-target-for-flow)
[![Latest version on vaadin.com/directory](https://img.shields.io/vaadin-directory/v/scroll-target-for-flow.svg)](https://vaadin.com/directory/component/scroll-target-for-flow)
[![Rating on vaadin.com/directory](https://img.shields.io/vaadin-directory/rating/scroll-target-for-flow.svg)](https://vaadin.com/directory/component/scroll-target-for-flow)

# Scroll Target for Flow

Vaadin 10+ Java integration of https://github.com/fluorumlabs/scroll-target

&lt;scroll-target&gt; is a really simple web component for making scrolling easier. 
ll you need to do is to wrap the content you want to scroll to and call `ensureVisibility()`:

```java
ScrollTarget target = new ScrollTarget(new Paragraph("..."));

...

target.ensureVisibility();
```

![ScrollTarget demo recording](https://raw.githubusercontent.com/fluorumlabs/scroll-target-for-flow/master/demo-recording.gif)

## Methods

```java
ScrollTarget.setTopOffset(<offset_in_pixels>);
```

`setTopOffset` defines a space that should be reserved for fixed top menu when scrolling. Can be set via `top-offset` attribute.

```javascript
ScrollTarget.ensureVisibility();

ScrollTarget.ensureVisibility(<delay_in_milliseconds>);
```

`ensureVisibility` scrolls to make the wrapped content visible. If optional `<delay_in_milliseconds>` is specified, scrolling will be delayed by specified amount of time.

# Getting started

```xml
<dependency>
   <groupId>org.vaadin.helper</groupId>
   <artifactId>scroll-target-for-flow</artifactId>
   <version>1.0.0</version>
</dependency>

...

<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
```

