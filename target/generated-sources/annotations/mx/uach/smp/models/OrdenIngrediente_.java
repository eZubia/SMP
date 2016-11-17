package mx.uach.smp.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdenIngrediente.class)
public abstract class OrdenIngrediente_ extends mx.uach.smp.models.genericos.BaseModel_ {

	public static volatile SingularAttribute<OrdenIngrediente, Double> cantidadPedida;
	public static volatile SingularAttribute<OrdenIngrediente, Double> totalPedido;
	public static volatile SingularAttribute<OrdenIngrediente, Date> fechaPedido;

}

