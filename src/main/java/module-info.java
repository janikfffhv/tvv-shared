module tvv.shared {
    requires java.rmi;
    requires beta.jboss.ejb.api_3_2;
    exports at.fhv.tvv.shared.ejb;
    exports at.fhv.tvv.shared.dto;
    exports at.fhv.tvv.shared.rmi;
}