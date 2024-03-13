<template>
    <div>
        <div>
            메세지 1 :
            <input :value="msg1" @input="$emit('update:msg1', $event.target.value)" />
        </div>
        <div>
            메세지 2 :
            <input :value="msg2" @input="$emit('update:msg2', $event.target.value)" />
        </div>
    </div>
</template>

<script>

export default {
    props: ['msg1', 'msg2'],
    emits: ['update:msg1', 'update:msg2']
}
</script>