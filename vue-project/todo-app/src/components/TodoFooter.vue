<template>
    <div class="clearAllContainer">
        <span class="clearAllBtn" @click="removeItem">Clear All</span>
    </div>
</template>
<script>
export default {
    props:  ['todoList'],
    methods:{
        removeItem(){
            this.$emit('delAll')
        }
    }
}
</script>
<style scoped>
.clearAllContainer{
    width: 8.5rem;
    height: 50px;
    line-height: 50px;
    background-color: white;
    border-radius: 5px;
    margin: 0 auto;
}
.clearAllBtn{
    color: #e20303;
    display: block;
}
</style>