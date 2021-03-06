package co.edu.sena.ejemplotemplates.view.frontcontroller;

import co.edu.sena.ejemplotemplates.model.entities.ServidorCorreoElectronico;
import co.edu.sena.ejemplotemplates.view.frontcontroller.util.JsfUtil;
import co.edu.sena.ejemplotemplates.view.frontcontroller.util.JsfUtil.PersistAction;
import co.edu.sena.ejemplotemplates.controller.ejbs.ServidorCorreoElectronicoFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("servidorCorreoElectronicoController")
@SessionScoped
public class ServidorCorreoElectronicoController implements Serializable {

    @EJB
    private co.edu.sena.ejemplotemplates.controller.ejbs.ServidorCorreoElectronicoFacade ejbFacade;
    private List<ServidorCorreoElectronico> items = null;
    private ServidorCorreoElectronico selected;

    public ServidorCorreoElectronicoController() {
    }

    public ServidorCorreoElectronico getSelected() {
        return selected;
    }

    public void setSelected(ServidorCorreoElectronico selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ServidorCorreoElectronicoFacade getFacade() {
        return ejbFacade;
    }

    public ServidorCorreoElectronico prepareCreate() {
        selected = new ServidorCorreoElectronico();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("ServidorCorreoElectronicoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("ServidorCorreoElectronicoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("ServidorCorreoElectronicoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<ServidorCorreoElectronico> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public ServidorCorreoElectronico getServidorCorreoElectronico(java.lang.String id) {
        return getFacade().find(id);
    }

    public List<ServidorCorreoElectronico> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<ServidorCorreoElectronico> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = ServidorCorreoElectronico.class)
    public static class ServidorCorreoElectronicoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ServidorCorreoElectronicoController controller = (ServidorCorreoElectronicoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "servidorCorreoElectronicoController");
            return controller.getServidorCorreoElectronico(getKey(value));
        }

        java.lang.String getKey(String value) {
            java.lang.String key;
            key = value;
            return key;
        }

        String getStringKey(java.lang.String value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ServidorCorreoElectronico) {
                ServidorCorreoElectronico o = (ServidorCorreoElectronico) object;
                return getStringKey(o.getCorreo());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ServidorCorreoElectronico.class.getName()});
                return null;
            }
        }

    }

}
