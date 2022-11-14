package cz.cvut.fel.omo.inspection.presentation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.naming.Context;

import cz.cvut.fel.omo.inspection.metamodel.AFContext;


import cz.cvut.fel.omo.inspection.securityAndValidation.Email;
import cz.cvut.fel.omo.inspection.securityAndValidation.Max;
import cz.cvut.fel.omo.inspection.securityAndValidation.Min;
import cz.cvut.fel.omo.inspection.securityAndValidation.NotNull;
import cz.cvut.fel.omo.inspection.securityAndValidation.NotNullChecker;
import cz.cvut.fel.omo.inspection.securityAndValidation.Password;
import cz.cvut.fel.omo.inspection.securityAndValidation.PasswordChecker;
import cz.cvut.fel.omo.inspection.securityAndValidation.SecurityChecker;
import cz.cvut.fel.omo.inspection.securityAndValidation.UiUserRoles;

import cz.cvut.fel.omo.inspection.metamodel.*;
import cz.cvut.fel.omo.inspection.model.ClassExample;

import cz.cvut.fel.omo.inspection.Main;

//@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class Presentation {

    private AFContext afContext = null;
    private Context context = null;
    private Object instance = null;
    private MetaModel metamodel = null;
    private String layoutStyle = "linear"; // default
    private String type = null;
    private String name = null;
    private String valueOfAttribute = "";
    private String nameOfInstance = null;
    private ArrayList arraylistOfInstances;

    public Presentation(Context myContext, Object myinstance, ArrayList myArraylistOfInstances) {
        context = myContext;
        instance = myinstance;
        arraylistOfInstances = myArraylistOfInstances;
    }

    public Presentation(Context myContext, ArrayList myArraylistOfInstances) {
        context = myContext;
        arraylistOfInstances = myArraylistOfInstances;
    }

    public void setLayout(String layout) {
        this.layoutStyle = layout;
    }

    public void buildCache(ArrayList arraylistOfInstances, AFContext afContext) {
        this.afContext = afContext;

        if (afContext.cache == null) {
            afContext.cache = new HashMap<String, MetaModel>();

            for (int j = 0; j < arraylistOfInstances.size(); j++) {
                Object object = arraylistOfInstances.get(j);
                Class clazz = object.getClass();
                Field[] fields = clazz.getDeclaredFields();

                MetaModel metamodel = new MetaModel();
                metamodel.name = clazz.getSimpleName();
                
                System.out.println("name: "+metamodel.name);
                System.out.println("-------------------");

                // ### getting annotations of instance ###
                //todo
                // ### getting fields and annotations of fields ###
                //todo

                //save metamodel to cache
                afContext.cache.put(metamodel.name, metamodel);
            }
        }
    }
}
