package com.esotericsoftware.yamlbeans.compound;

import com.esotericsoftware.yamlbeans.Beans;
import com.esotericsoftware.yamlbeans.YamlException;

import java.util.Set;


/**
 * By default, the set of properties will contain all the Bean properties of a given class.
 * The properties for a class can be filtered here in order to select which properties are serialized.
 * Created by leroy on 27/04/15.
 */
public interface PropertyFilter {
    abstract public Set<Beans.Property> filter(Set<Beans.Property> properties) throws YamlException;
}
