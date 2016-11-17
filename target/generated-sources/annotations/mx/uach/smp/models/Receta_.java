package mx.uach.smp.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Receta.class)
public abstract class Receta_ extends mx.uach.smp.models.genericos.BaseModel_ {

	public static volatile SingularAttribute<Receta, String> descripcion;
	public static volatile SingularAttribute<Receta, Integer> producidos;
	public static volatile SingularAttribute<Receta, Integer> tiempoCoccion;
	public static volatile SingularAttribute<Receta, Producto> producto;

}

