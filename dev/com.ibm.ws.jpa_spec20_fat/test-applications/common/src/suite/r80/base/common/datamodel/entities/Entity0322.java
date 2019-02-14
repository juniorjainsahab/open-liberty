/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package suite.r80.base.common.datamodel.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * <p>Entity of the Common Datamodel (which uses all the possible JPA 2.0 Annotations as described in the
 * <a href="http://www.j2ee.me/javaee/6/docs/api/javax/persistence/package-summary.html">javax.persistence documentation</a>)
 * All the Entity0xxx named entities are the base of a class hierarchy and define the primary key for the entire hierarchy.
 * Per the JSR 317 final spec (page 28), the primary key of these base classes may be any of the Java primitive types,
 * Java primitive wrapper types, or a composite primary key (via @IdClass annotation)
 *
 *
 * <p>These annotations are exercised:
 * <ul>
 * <li><b>@Id</b> (22 of 65):
 * <p>Specifies the primary key property or field of an entity
 * <p>These are the possible @Id combinations:
 * <ol>
 * <li>@Id on field/property (of type byte)
 * <li>@Id on field/property (of type Byte)
 * <li>@Id on field/property (of type char)
 * <li>@Id on field/property (of type Character)
 * <li>@Id on field/property (of type String)
 * <li>@Id on field/property (of type double)
 * <li>@Id on field/property (of type Double)
 * <li>@Id on field/property (of type float)
 * <li>@Id on field/property (of type Float)
 * <li>@Id on field/property (of type int)
 * <li>@Id on field/property (of type Integer)
 * <li>@Id on field/property (of type long)
 * <li>@Id on field/property (of type Long)
 * <li>@Id on field/property (of type short)
 * <li>@Id on field/property (of type Short)
 * <li>@Id on field/property (of type BigDecimal)
 * <li>@Id on field/property (of type BigInteger)
 * <li>@Id on field/property (of type java.util.Date)
 * <li>@Id on field/property (of type java.sql.Date)
 * <li>@Id on field/property (of type Object)
 * <li>@Id on field/property (of type Object ID)
 * </ol>
 * <p>These are the @Id combinations exercised in this entity:
 * <ul>
 * <li>@Id on field/property (of type char)
 * <li>@Id on field/property (of type String)
 * <li>@Id on field/property (of type Double)
 * </ul>
 *
 * <li><b>@Version</b> (65 of 65):
 * <p>This annotation specifies the version field or property of an entity class that serves as its optimistic lock value
 * <p>These are the possible @Version combinations:
 * <ul>
 * <li>@Version on field/property (of type int)
 * <li>@Version on field/property (of type Integer)
 * <li>@Version on field/property (of type long)
 * <li>@Version on field/property (of type Long)
 * <li>@Version on field/property (of type short)
 * <li>@Version on field/property (of type Short)
 * <li>@Version on field/property (of type Timestamp)
 * </ul>
 * <p>These are the @Version combinations exercised in this entity:
 * <ul>
 * <li>@Version on field/property (of type Integer)
 * </ul>
 * </ul>
 *
 *
 * <p><b>Notes:</b>
 * <ol>
 * <li>Uses a compound primary key and an Id class
 * </ol>
 */
@NamedQueries(
              value = {
                        @NamedQuery(name = "ENTITY0322_SELECT",
                                    query = "SELECT e FROM Entity0322 e WHERE e.entity0322_id1 = :id1_0322 AND e.entity0322_id2 = :id2_0322 AND e.entity0322_id3 = :id3_0322")
              })
@Entity
@IdClass(IdClass0322.class)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "CDM_Entity0322")
public class Entity0322 {

    @Id
    private char entity0322_id1;

    @Id
    private String entity0322_id2;

    @Id
    private Double entity0322_id3;

    @Version
    private Integer entity0322_version;

    private String entity0322_string01;

    private String entity0322_string02;

    private String entity0322_string03;

    public Entity0322() {}

    public Entity0322(char id1,
                      String id2,
                      Double id3,
                      Integer version,
                      String string01,
                      String string02,
                      String string03) {
        this.entity0322_id1 = id1;
        this.entity0322_id2 = id2;
        this.entity0322_id3 = id3;
        this.entity0322_version = version;
        this.entity0322_string01 = string01;
        this.entity0322_string02 = string02;
        this.entity0322_string03 = string03;
    }

    @Override
    public String toString() {
        return (" Entity0322: " +
                " entity0322_id1: " + getEntity0322_id1() +
                " entity0322_id2: " + getEntity0322_id2() +
                " entity0322_id3: " + getEntity0322_id3() +
                " entity0322_version: " + getEntity0322_version() +
                " entity0322_string01: " + getEntity0322_string01() +
                " entity0322_string02: " + getEntity0322_string02() +
                " entity0322_string03: " + getEntity0322_string03());
    }

    //----------------------------------------------------------------------------------------------
    // Persisent property accessor(s)
    //----------------------------------------------------------------------------------------------
    public char getEntity0322_id1() {
        return entity0322_id1;
    }

    public void setEntity0322_id1(char p) {
        this.entity0322_id1 = p;
    }

    public String getEntity0322_id2() {
        return entity0322_id2;
    }

    public void setEntity0322_id2(String p) {
        this.entity0322_id2 = p;
    }

    public Double getEntity0322_id3() {
        return entity0322_id3;
    }

    public void setEntity0322_id3(Double p) {
        this.entity0322_id3 = p;
    }

    public Integer getEntity0322_version() {
        return entity0322_version;
    }

    public void setEntity0322_version(Integer p) {
        this.entity0322_version = p;
    }

    public String getEntity0322_string01() {
        return entity0322_string01;
    }

    public void setEntity0322_string01(String p) {
        this.entity0322_string01 = p;
    }

    public String getEntity0322_string02() {
        return entity0322_string02;
    }

    public void setEntity0322_string02(String p) {
        this.entity0322_string02 = p;
    }

    public String getEntity0322_string03() {
        return entity0322_string03;
    }

    public void setEntity0322_string03(String p) {
        this.entity0322_string03 = p;
    }
}
