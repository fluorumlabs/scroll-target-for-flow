# Scroll Target for Flow

Vaadin 10+ Java integration of https://github.com/fluorumlabs/scroll-target

&lt;scroll-target&gt; is a really simple web component for making scrolling easier. 
ll you need to do is to wrap the content you want to scroll to and call `ensureVisibility()`:

```java
ScrollTarget target = new ScrollTarget(new Paragraph("..."));

...

target.ensureVisibility();
```

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
