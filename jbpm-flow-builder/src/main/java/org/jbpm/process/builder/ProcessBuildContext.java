package org.jbpm.process.builder;

import org.drools.compiler.compiler.Dialect;
import org.drools.compiler.compiler.DialectCompiletimeRegistry;
import org.drools.compiler.compiler.PackageBuilder;
import org.kie.api.definition.process.Process;
import org.drools.compiler.lang.descr.BaseDescr;
import org.drools.compiler.lang.descr.ProcessDescr;
import org.drools.core.rule.Package;
import org.drools.compiler.rule.builder.PackageBuildContext;

public class ProcessBuildContext extends PackageBuildContext {
	
    private Process      process;
    private ProcessDescr processDescr;
    private DialectCompiletimeRegistry dialectRegistry;

    public ProcessBuildContext(final PackageBuilder pkgBuilder,
                               final Package pkg,
                               final Process process,
                               final BaseDescr processDescr,
                               final DialectCompiletimeRegistry dialectRegistry,
                               final Dialect defaultDialect) {
        this.process = process;
        this.processDescr = (ProcessDescr) processDescr;
        this.dialectRegistry = dialectRegistry;
        init( pkgBuilder,
              pkg,
              processDescr,
              dialectRegistry,
              defaultDialect,
              null );

    }

    public ProcessDescr getProcessDescr() {
        return processDescr;
    }

    public void setProcessDescr(ProcessDescr processDescr) {
        this.processDescr = processDescr;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
    
    public DialectCompiletimeRegistry getDialectRegistry() {
    	return dialectRegistry;
    }

}
