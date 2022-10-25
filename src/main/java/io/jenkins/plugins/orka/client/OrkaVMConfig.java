package io.jenkins.plugins.orka.client;

import com.google.gson.annotations.SerializedName;

public class OrkaVMConfig {

    @SerializedName("orka_vm_name")
    private String name;

    @SerializedName("orka_cpu_core")
    private int cpuCount;

    @SerializedName("orka_base_image")
    private String baseImage;

    private String memory;

    private String tag;

    @SerializedName("tag_required")
    private boolean tagRequired;

    public OrkaVMConfig(String name, int cpuCount, String baseImage) {
        this(name, cpuCount, baseImage, "auto", null, false);
    }

    public OrkaVMConfig(String name, int cpuCount, String baseImage, String memory, String tag, boolean tagRequired) {
        this.name = name;
        this.cpuCount = cpuCount;
        this.baseImage = baseImage;
        this.memory = memory;
        this.tag = tag;
        this.tagRequired = tagRequired;
    }

    public String getName() {
        return this.name;
    }

    public int getCPUCount() {
        return this.cpuCount;
    }

    public String getBaseImage() {
        return this.baseImage;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean getTagRequired() {
        return this.tagRequired;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((baseImage == null) ? 0 : baseImage.hashCode());
        result = prime * result + cpuCount;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((memory == null) ? 0 : memory.hashCode());
        result = prime * result + ((tag == null) ? 0 : tag.hashCode());
        result = prime * result + ((!tagRequired) ? 0 : Boolean.hashCode(tagRequired));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OrkaVMConfig other = (OrkaVMConfig) obj;
        if (baseImage == null) {
            if (other.baseImage != null) {
                return false;
            }
        } else if (!baseImage.equals(other.baseImage)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (memory == null) {
            if (other.memory != null) {
                return false;
            }
        } else if (!memory.equals(other.memory)) {
            return false;
        }
        if (tag == null) {
            if (other.tag != null) {
                return false;
            }
        } else if (!tag.equals(other.tag)) {
            return false;
        }
        return true;
    }
}