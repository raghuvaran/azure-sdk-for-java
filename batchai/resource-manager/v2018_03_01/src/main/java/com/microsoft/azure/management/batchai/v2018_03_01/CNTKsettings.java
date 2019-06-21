/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the settings for CNTK (aka Microsoft Cognitive Toolkit) job.
 */
public class CNTKsettings {
    /**
     * Specifies the language type to use for launching CNTK (aka Microsoft
     * Cognitive Toolkit) job.
     * Valid values are 'BrainScript' or 'Python'.
     */
    @JsonProperty(value = "languageType")
    private String languageType;

    /**
     * Specifies the path of the config file.
     * This property can be specified only if the languageType is
     * 'BrainScript'.
     */
    @JsonProperty(value = "configFilePath")
    private String configFilePath;

    /**
     * The path and file name of the python script to execute the job.
     * This property can be specified only if the languageType is 'Python'.
     */
    @JsonProperty(value = "pythonScriptFilePath")
    private String pythonScriptFilePath;

    /**
     * The path to python interpreter.
     * This property can be specified only if the languageType is 'Python'.
     */
    @JsonProperty(value = "pythonInterpreterPath")
    private String pythonInterpreterPath;

    /**
     * Command line arguments that needs to be passed to the python script or
     * CNTK.exe.
     */
    @JsonProperty(value = "commandLineArgs")
    private String commandLineArgs;

    /**
     * Number of processes parameter that is passed to MPI runtime.
     * The default value for this property is equal to nodeCount property.
     */
    @JsonProperty(value = "processCount")
    private Integer processCount;

    /**
     * Get valid values are 'BrainScript' or 'Python'.
     *
     * @return the languageType value
     */
    public String languageType() {
        return this.languageType;
    }

    /**
     * Set valid values are 'BrainScript' or 'Python'.
     *
     * @param languageType the languageType value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    /**
     * Get this property can be specified only if the languageType is 'BrainScript'.
     *
     * @return the configFilePath value
     */
    public String configFilePath() {
        return this.configFilePath;
    }

    /**
     * Set this property can be specified only if the languageType is 'BrainScript'.
     *
     * @param configFilePath the configFilePath value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
        return this;
    }

    /**
     * Get this property can be specified only if the languageType is 'Python'.
     *
     * @return the pythonScriptFilePath value
     */
    public String pythonScriptFilePath() {
        return this.pythonScriptFilePath;
    }

    /**
     * Set this property can be specified only if the languageType is 'Python'.
     *
     * @param pythonScriptFilePath the pythonScriptFilePath value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withPythonScriptFilePath(String pythonScriptFilePath) {
        this.pythonScriptFilePath = pythonScriptFilePath;
        return this;
    }

    /**
     * Get this property can be specified only if the languageType is 'Python'.
     *
     * @return the pythonInterpreterPath value
     */
    public String pythonInterpreterPath() {
        return this.pythonInterpreterPath;
    }

    /**
     * Set this property can be specified only if the languageType is 'Python'.
     *
     * @param pythonInterpreterPath the pythonInterpreterPath value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withPythonInterpreterPath(String pythonInterpreterPath) {
        this.pythonInterpreterPath = pythonInterpreterPath;
        return this;
    }

    /**
     * Get the commandLineArgs value.
     *
     * @return the commandLineArgs value
     */
    public String commandLineArgs() {
        return this.commandLineArgs;
    }

    /**
     * Set the commandLineArgs value.
     *
     * @param commandLineArgs the commandLineArgs value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withCommandLineArgs(String commandLineArgs) {
        this.commandLineArgs = commandLineArgs;
        return this;
    }

    /**
     * Get the default value for this property is equal to nodeCount property.
     *
     * @return the processCount value
     */
    public Integer processCount() {
        return this.processCount;
    }

    /**
     * Set the default value for this property is equal to nodeCount property.
     *
     * @param processCount the processCount value to set
     * @return the CNTKsettings object itself.
     */
    public CNTKsettings withProcessCount(Integer processCount) {
        this.processCount = processCount;
        return this;
    }

}
