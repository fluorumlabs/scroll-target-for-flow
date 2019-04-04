package org.vaadin.helper;

import com.thedeanda.lorem.LoremIpsum;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Random;

@Route("")
public class DemoView extends VerticalLayout {
    private Random random = new Random();

    public DemoView() {
        ScrollTarget[] scrollTargets = new ScrollTarget[5];
        for (int i = 0; i < scrollTargets.length; i++) {
            scrollTargets[i] = buildChapters(i + 1, random.nextInt(3) + 2);
        }

        for (int i = 0; i < scrollTargets.length; i++) {
            add(buildButtons(scrollTargets), scrollTargets[i]);
        }

        add(buildButtons(scrollTargets));
    }

    private ScrollTarget buildChapters(int index, int length) {
        ScrollTarget target = new ScrollTarget();
        target.add(new H1(String.format("Chapter %d", index)));
        for (int i = 0; i < length; i++) {
            target.add(new Paragraph(LoremIpsum.getInstance().getParagraphs(1, 1)));
        }
        return target;
    }

    private Div buildButtons(ScrollTarget[] targets) {
        Div buttons = new Div();
        for (int i = 0; i < targets.length; i++) {
            int index = i;
            buttons.add(new Button(String.format("Chapter %d", i + 1), event -> targets[index].ensureVisibility()));
        }
        return buttons;
    }
}
