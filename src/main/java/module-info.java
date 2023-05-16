module tvv.shared {
    requires java.rmi;
    requires javax.ejb.api;
    exports at.fhv.tvv.shared.ejb;
    exports at.fhv.tvv.shared.dto;
    exports at.fhv.tvv.shared.rmi;
}