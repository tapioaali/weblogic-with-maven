package com.vaadin.tutorial;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@SuppressWarnings("serial")
public class WeblogicMavenUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = WeblogicMavenUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);

        Label titleLabel = new Label(
                "Vaadin Weblogic Deployment Test Application");
        titleLabel.addStyleName(ValoTheme.LABEL_H1);
        layout.addComponent(titleLabel);

        Label otherLabel = new Label("Application running successfully!");
        otherLabel.addStyleName(ValoTheme.LABEL_SUCCESS);
        layout.addComponent(otherLabel);
    }
}