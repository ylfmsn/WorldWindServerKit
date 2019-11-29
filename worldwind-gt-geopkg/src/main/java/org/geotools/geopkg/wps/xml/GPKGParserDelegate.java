/*
 * Copyright (C) 2017 NASA World Wind.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package org.geotools.geopkg.wps.xml;

import org.geotools.xsd.XSDParserDelegate;

/**
 * GPKGParserDelegate is a XSDParserDelegate that knows how to parse the
 * gpkg.xsd schema.  A GPKGParserDelegate must be added to the WPSConfiguration
 * to process {@code <geopackage/>} contents via a WPS request.
 *
 * @author Bruce Schubert
 */
public class GPKGParserDelegate extends XSDParserDelegate {

    public GPKGParserDelegate() {
        super(new GPKGConfiguration());
    }

}
